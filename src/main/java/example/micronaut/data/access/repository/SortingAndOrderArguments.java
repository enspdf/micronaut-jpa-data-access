package example.micronaut.data.access.repository;

import javax.annotation.Nullable;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.Optional;

public class SortingAndOrderArguments {
    @Nullable
    @PositiveOrZero
    private Integer offset;

    @Nullable
    @Positive
    private Integer max;

    @Nullable
    @Pattern(regexp = "id|name")
    private String sort;

    @Nullable
    @Pattern(regexp = "asc|ASC|desc|DESC")
    private String order;

    public SortingAndOrderArguments() {
    }

    @Nullable
    public Optional<Integer> getOffset() {
        if (offset == null) {
            return Optional.empty();
        }

        return Optional.of(offset);
    }

    public void setOffset(@Nullable Integer offset) {
        this.offset = offset;
    }

    @Nullable
    public Optional<Integer> getMax() {
        if (max == null) {
            return Optional.empty();
        }

        return Optional.of(max);
    }

    public void setMax(@Nullable Integer max) {
        this.max = max;
    }

    @Nullable
    public Optional<String> getSort() {
        if (sort == null) {
            return Optional.empty();
        }

        return Optional.of(sort);
    }

    public void setSort(@Nullable String sort) {
        this.sort = sort;
    }

    @Nullable
    public Optional<String> getOrder() {
        if (order == null) {
            return Optional.empty();
        }

        return Optional.of(order);
    }

    public void setOrder(@Nullable String order) {
        this.order = order;
    }
}
