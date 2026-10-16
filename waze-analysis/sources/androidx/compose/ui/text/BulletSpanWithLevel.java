package androidx.compose.ui.text;

import androidx.compose.ui.graphics.drawscope.DrawStyle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BulletSpanWithLevel {
    public static final int $stable = DrawStyle.$stable;
    private final Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public BulletSpanWithLevel(Bullet bullet, int i2, int i3) {
        this.bullet = bullet;
        this.indentationLevel = i2;
        this.start = i3;
    }

    public static /* synthetic */ BulletSpanWithLevel copy$default(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i4 & 2) != 0) {
            i2 = bulletSpanWithLevel.indentationLevel;
        }
        if ((i4 & 4) != 0) {
            i3 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i2, i3);
    }

    public final Bullet component1() {
        return this.bullet;
    }

    public final int component2() {
        return this.indentationLevel;
    }

    public final int component3() {
        return this.start;
    }

    public final BulletSpanWithLevel copy(Bullet bullet, int i2, int i3) {
        return new BulletSpanWithLevel(bullet, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return x.n(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public final Bullet getBullet() {
        return this.bullet;
    }

    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.bullet.hashCode() * 31) + this.indentationLevel) * 31) + this.start;
    }

    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.bullet + ", indentationLevel=" + this.indentationLevel + ", start=" + this.start + ')';
    }
}
