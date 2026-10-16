package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import h.ab;
import h.g.a.p;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$3 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $fill;
    final /* synthetic */ float $fillAlpha;
    final /* synthetic */ String $name;
    final /* synthetic */ List<PathNode> $pathData;
    final /* synthetic */ int $pathFillType;
    final /* synthetic */ Brush $stroke;
    final /* synthetic */ float $strokeAlpha;
    final /* synthetic */ int $strokeLineCap;
    final /* synthetic */ int $strokeLineJoin;
    final /* synthetic */ float $strokeLineMiter;
    final /* synthetic */ float $strokeLineWidth;
    final /* synthetic */ float $trimPathEnd;
    final /* synthetic */ float $trimPathOffset;
    final /* synthetic */ float $trimPathStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VectorComposeKt$Path$3(List<? extends PathNode> list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, int i6, int i7) {
        super(2);
        this.$pathData = list;
        this.$pathFillType = i2;
        this.$name = str;
        this.$fill = brush;
        this.$fillAlpha = f2;
        this.$stroke = brush2;
        this.$strokeAlpha = f3;
        this.$strokeLineWidth = f4;
        this.$strokeLineCap = i3;
        this.$strokeLineJoin = i4;
        this.$strokeLineMiter = f5;
        this.$trimPathStart = f6;
        this.$trimPathEnd = f7;
        this.$trimPathOffset = f8;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    public final void invoke(Composer composer, int i2) {
        int i3 = this.$$changed;
        int i4 = this.$$changed1;
        VectorComposeKt.m9009Path9cdaXJ4(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), this.$$default);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
