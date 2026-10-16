package Va;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public abstract class F8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13337f = {0};

    /* renamed from: g, reason: collision with root package name */
    public static int f13338g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13339h = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13340d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1215y8 f13341e;

    public F8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82) {
        this.f13340d = abstractC1215y8;
        this.f13341e = abstractC1215y82;
    }

    public static String g(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 2;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13337f[(-1260101218) + i11] + 2);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1260101220) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 2108541867);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13337f;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final AbstractC1215y8 e() {
        int i5 = f13338g;
        int i10 = i5 + 51;
        f13339h = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 41;
        f13339h = i11 % 128;
        int i12 = i11 % 2;
        AbstractC1215y8 abstractC1215y8 = this.f13340d;
        if (i12 == 0) {
            int i13 = 93 / 0;
        }
        return abstractC1215y8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r3.equals(r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r7 = r7.f13341e;
        r2 = r6.f13341e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        return r2.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto Lc
            int r7 = Va.F8.f13338g
            int r7 = r7 + 119
            int r7 = r7 % 128
            Va.F8.f13339h = r7
            return r0
        Lc:
            r1 = 0
            if (r7 == 0) goto L4b
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L1a
            goto L4b
        L1a:
            Va.F8 r7 = (Va.F8) r7
            Va.y8 r2 = r7.f13340d
            Va.y8 r3 = r6.f13340d
            if (r3 == 0) goto L3a
            int r4 = Va.F8.f13338g
            int r4 = r4 + 53
            int r5 = r4 % 128
            Va.F8.f13339h = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L35
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3d
            goto L3c
        L35:
            r3.equals(r2)
            r7 = 0
            throw r7
        L3a:
            if (r2 == 0) goto L3d
        L3c:
            return r1
        L3d:
            Va.y8 r7 = r7.f13341e
            Va.y8 r2 = r6.f13341e
            if (r2 == 0) goto L48
            boolean r7 = r2.equals(r7)
            return r7
        L48:
            if (r7 != 0) goto L4b
            return r0
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.F8.equals(java.lang.Object):boolean");
    }

    public final AbstractC1215y8 f() {
        int i5 = f13338g + 125;
        f13339h = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f13341e;
        }
        throw null;
    }

    public abstract String h();

    public final int hashCode() {
        int iHashCode = 0;
        AbstractC1215y8 abstractC1215y8 = this.f13340d;
        int iHashCode2 = (abstractC1215y8 != null ? abstractC1215y8.hashCode() : 0) * 31;
        AbstractC1215y8 abstractC1215y82 = this.f13341e;
        if (abstractC1215y82 != null) {
            int i5 = f13339h + 31;
            f13338g = i5 % 128;
            if (i5 % 2 != 0) {
                abstractC1215y82.hashCode();
                throw null;
            }
            iHashCode = abstractC1215y82.hashCode();
        } else {
            f13339h = (f13338g + 27) % 128;
        }
        int i10 = iHashCode2 + iHashCode;
        f13338g = (f13339h + 1) % 128;
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13340d);
        sb2.append(g((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 2108541899, (-1) - (ViewConfiguration.getJumpTapTimeout() >> 16), 1260101218 - ExpandableListView.getPackedPositionGroup(0L), (byte) TextUtils.indexOf("", "", 0)).intern());
        sb2.append(h());
        sb2.append(g((short) ((-1) - MotionEvent.axisFromString("")), 2108541899 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1260101218, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern());
        sb2.append(this.f13341e);
        String string = sb2.toString();
        int i5 = f13339h + 101;
        f13338g = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 13 / 0;
        }
        return string;
    }
}
