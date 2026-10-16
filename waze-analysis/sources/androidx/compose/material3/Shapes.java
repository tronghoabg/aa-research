package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;
    private ButtonShapes defaultButtonShapesCached;
    private ChipShapes defaultChipShapesCached;
    private IconButtonShapes defaultIconButtonShapesCached;
    private IconToggleButtonShapes defaultIconToggleButtonShapesCached;
    private ListItemShapes defaultListItemShapesCached;
    private MenuGroupShapes defaultMenuLeadingGroupShapesCached;
    private MenuItemShapes defaultMenuLeadingItemShapesCached;
    private MenuGroupShapes defaultMenuMiddleGroupShapesCached;
    private MenuItemShapes defaultMenuMiddleItemShapesCached;
    private MenuGroupShapes defaultMenuStandaloneGroupShapesCached;
    private MenuItemShapes defaultMenuStandaloneItemShapesCached;
    private MenuGroupShapes defaultMenuTrailingGroupShapesCached;
    private MenuItemShapes defaultMenuTrailingItemShapesCached;
    private ToggleButtonShapes defaultToggleButtonShapesCached;
    private DragHandleShapes defaultVerticalDragHandleShapesCached;
    private final CornerBasedShape extraExtraLarge;
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraLargeIncreased;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape largeIncreased;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8, int i2, o oVar) {
        this((i2 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i2 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i2 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i2 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i2 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5, (i2 & 32) != 0 ? ShapeDefaults.INSTANCE.getLargeIncreased() : cornerBasedShape6, (i2 & 64) != 0 ? ShapeDefaults.INSTANCE.getExtraLargeIncreased() : cornerBasedShape7, (i2 & 128) != 0 ? ShapeDefaults.INSTANCE.getExtraExtraLarge() : cornerBasedShape8);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i2 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        if ((i2 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        if ((i2 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        if ((i2 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        if ((i2 & 32) != 0) {
            cornerBasedShape6 = shapes.largeIncreased;
        }
        if ((i2 & 64) != 0) {
            cornerBasedShape7 = shapes.extraLargeIncreased;
        }
        if ((i2 & 128) != 0) {
            cornerBasedShape8 = shapes.extraExtraLarge;
        }
        CornerBasedShape cornerBasedShape9 = cornerBasedShape7;
        CornerBasedShape cornerBasedShape10 = cornerBasedShape8;
        CornerBasedShape cornerBasedShape11 = cornerBasedShape5;
        CornerBasedShape cornerBasedShape12 = cornerBasedShape6;
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape11, cornerBasedShape12, cornerBasedShape9, cornerBasedShape10);
    }

    public final Shapes copy(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return x.n(this.extraSmall, shapes.extraSmall) && x.n(this.small, shapes.small) && x.n(this.medium, shapes.medium) && x.n(this.large, shapes.large) && x.n(this.extraLarge, shapes.extraLarge) && x.n(this.largeIncreased, shapes.largeIncreased) && x.n(this.extraLargeIncreased, shapes.extraLargeIncreased) && x.n(this.extraExtraLarge, shapes.extraExtraLarge);
    }

    public final ButtonShapes getDefaultButtonShapesCached$material3() {
        return this.defaultButtonShapesCached;
    }

    public final ChipShapes getDefaultChipShapesCached$material3() {
        return this.defaultChipShapesCached;
    }

    public final IconButtonShapes getDefaultIconButtonShapesCached$material3() {
        return this.defaultIconButtonShapesCached;
    }

    public final IconToggleButtonShapes getDefaultIconToggleButtonShapesCached$material3() {
        return this.defaultIconToggleButtonShapesCached;
    }

    public final ListItemShapes getDefaultListItemShapesCached$material3() {
        return this.defaultListItemShapesCached;
    }

    public final MenuGroupShapes getDefaultMenuLeadingGroupShapesCached$material3() {
        return this.defaultMenuLeadingGroupShapesCached;
    }

    public final MenuItemShapes getDefaultMenuLeadingItemShapesCached$material3() {
        return this.defaultMenuLeadingItemShapesCached;
    }

    public final MenuGroupShapes getDefaultMenuMiddleGroupShapesCached$material3() {
        return this.defaultMenuMiddleGroupShapesCached;
    }

    public final MenuItemShapes getDefaultMenuMiddleItemShapesCached$material3() {
        return this.defaultMenuMiddleItemShapesCached;
    }

    public final MenuGroupShapes getDefaultMenuStandaloneGroupShapesCached$material3() {
        return this.defaultMenuStandaloneGroupShapesCached;
    }

    public final MenuItemShapes getDefaultMenuStandaloneItemShapesCached$material3() {
        return this.defaultMenuStandaloneItemShapesCached;
    }

    public final MenuGroupShapes getDefaultMenuTrailingGroupShapesCached$material3() {
        return this.defaultMenuTrailingGroupShapesCached;
    }

    public final MenuItemShapes getDefaultMenuTrailingItemShapesCached$material3() {
        return this.defaultMenuTrailingItemShapesCached;
    }

    public final ToggleButtonShapes getDefaultToggleButtonShapesCached$material3() {
        return this.defaultToggleButtonShapesCached;
    }

    public final DragHandleShapes getDefaultVerticalDragHandleShapesCached$material3() {
        return this.defaultVerticalDragHandleShapesCached;
    }

    public final CornerBasedShape getExtraExtraLarge() {
        return this.extraExtraLarge;
    }

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public final CornerBasedShape getExtraLargeIncreased() {
        return this.extraLargeIncreased;
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getLargeIncreased() {
        return this.largeIncreased;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((((((((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode()) * 31) + this.largeIncreased.hashCode()) * 31) + this.extraLargeIncreased.hashCode()) * 31) + this.extraExtraLarge.hashCode();
    }

    public final void setDefaultButtonShapesCached$material3(ButtonShapes buttonShapes) {
        this.defaultButtonShapesCached = buttonShapes;
    }

    public final void setDefaultChipShapesCached$material3(ChipShapes chipShapes) {
        this.defaultChipShapesCached = chipShapes;
    }

    public final void setDefaultIconButtonShapesCached$material3(IconButtonShapes iconButtonShapes) {
        this.defaultIconButtonShapesCached = iconButtonShapes;
    }

    public final void setDefaultIconToggleButtonShapesCached$material3(IconToggleButtonShapes iconToggleButtonShapes) {
        this.defaultIconToggleButtonShapesCached = iconToggleButtonShapes;
    }

    public final void setDefaultListItemShapesCached$material3(ListItemShapes listItemShapes) {
        this.defaultListItemShapesCached = listItemShapes;
    }

    public final void setDefaultMenuLeadingGroupShapesCached$material3(MenuGroupShapes menuGroupShapes) {
        this.defaultMenuLeadingGroupShapesCached = menuGroupShapes;
    }

    public final void setDefaultMenuLeadingItemShapesCached$material3(MenuItemShapes menuItemShapes) {
        this.defaultMenuLeadingItemShapesCached = menuItemShapes;
    }

    public final void setDefaultMenuMiddleGroupShapesCached$material3(MenuGroupShapes menuGroupShapes) {
        this.defaultMenuMiddleGroupShapesCached = menuGroupShapes;
    }

    public final void setDefaultMenuMiddleItemShapesCached$material3(MenuItemShapes menuItemShapes) {
        this.defaultMenuMiddleItemShapesCached = menuItemShapes;
    }

    public final void setDefaultMenuStandaloneGroupShapesCached$material3(MenuGroupShapes menuGroupShapes) {
        this.defaultMenuStandaloneGroupShapesCached = menuGroupShapes;
    }

    public final void setDefaultMenuStandaloneItemShapesCached$material3(MenuItemShapes menuItemShapes) {
        this.defaultMenuStandaloneItemShapesCached = menuItemShapes;
    }

    public final void setDefaultMenuTrailingGroupShapesCached$material3(MenuGroupShapes menuGroupShapes) {
        this.defaultMenuTrailingGroupShapesCached = menuGroupShapes;
    }

    public final void setDefaultMenuTrailingItemShapesCached$material3(MenuItemShapes menuItemShapes) {
        this.defaultMenuTrailingItemShapesCached = menuItemShapes;
    }

    public final void setDefaultToggleButtonShapesCached$material3(ToggleButtonShapes toggleButtonShapes) {
        this.defaultToggleButtonShapesCached = toggleButtonShapes;
    }

    public final void setDefaultVerticalDragHandleShapesCached$material3(DragHandleShapes dragHandleShapes) {
        this.defaultVerticalDragHandleShapesCached = dragHandleShapes;
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", largeIncreased=" + this.largeIncreased + ", extraLarge=" + this.extraLarge + ", extralargeIncreased=" + this.extraLargeIncreased + ", extraExtraLarge=" + this.extraExtraLarge + ')';
    }

    public final Shapes copy(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5);
    }

    public static /* synthetic */ void getDefaultButtonShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultIconButtonShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultIconToggleButtonShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultListItemShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuLeadingGroupShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuLeadingItemShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuMiddleGroupShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuMiddleItemShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuStandaloneGroupShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuStandaloneItemShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuTrailingGroupShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultMenuTrailingItemShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultToggleButtonShapesCached$material3$annotations() {
    }

    public static /* synthetic */ void getExtraExtraLarge$annotations() {
    }

    public static /* synthetic */ void getExtraLargeIncreased$annotations() {
    }

    public static /* synthetic */ void getLargeIncreased$annotations() {
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i2 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        if ((i2 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        if ((i2 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        if ((i2 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape5;
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape7, cornerBasedShape4, cornerBasedShape6);
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8) {
        this.extraSmall = cornerBasedShape;
        this.small = cornerBasedShape2;
        this.medium = cornerBasedShape3;
        this.large = cornerBasedShape4;
        this.extraLarge = cornerBasedShape5;
        this.largeIncreased = cornerBasedShape6;
        this.extraLargeIncreased = cornerBasedShape7;
        this.extraExtraLarge = cornerBasedShape8;
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        this(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5, ShapeDefaults.INSTANCE.getLargeIncreased(), ShapeDefaults.INSTANCE.getExtraLargeIncreased(), ShapeDefaults.INSTANCE.getExtraExtraLarge());
    }

    public Shapes() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i2, o oVar) {
        this((i2 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i2 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i2 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i2 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i2 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
