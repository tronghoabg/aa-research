package defpackage;

import android.graphics.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uha implements uhc {
    public static final /* synthetic */ int a = 0;
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/vector/gl/drawable/GLAreaGroup");
    private static final ArrayDeque c = new ArrayDeque();
    private int d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final boolean g;

    private uha(boolean z) {
        this.g = z;
    }

    public static aeiy c() {
        ArrayDeque arrayDeque = c;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new aeiy(1024);
            }
            return (aeiy) arrayDeque.pop();
        }
    }

    public static void d(aeiy aeiyVar) {
        aeiyVar.clear();
        ArrayDeque arrayDeque = c;
        synchronized (arrayDeque) {
            arrayDeque.push(aeiyVar);
        }
    }

    public static boolean e(ujf ujfVar) {
        uke[] ukeVarArr;
        int length;
        if (!ujfVar.e && (length = (ukeVarArr = ujfVar.n).length) != 0) {
            for (int i = 0; i < length; i++) {
                if (ukeVarArr[i].d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(ujf ujfVar, boolean z) {
        if (z) {
            return true;
        }
        uke[] ukeVarArr = ujfVar.n;
        int length = ukeVarArr.length;
        if (length == 0) {
            return false;
        }
        if (length > 1) {
            return true;
        }
        for (int i = 0; i <= 0; i++) {
            uke ukeVar = ukeVarArr[i];
            if (ukeVar.d * uhj.a > 1.0f || Color.alpha(ukeVar.b) < 255 || ukeVar.c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r26 = r7;
        r27 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uha g(defpackage.ukq r40, defpackage.roa r41, defpackage.utz r42, defpackage.ukw r43, defpackage.uhd r44, defpackage.tzm r45, defpackage.utf r46, defpackage.uvx r47, com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable.GmmConfigurableTextureStyleIdShaderState r48, defpackage.uhz r49, java.util.List r50, boolean r51, java.util.Map r52, defpackage.tsr r53, boolean r54, java.util.List r55, boolean r56) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uha.g(ukq, roa, utz, ukw, uhd, tzm, utf, uvx, com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable.GmmConfigurableTextureStyleIdShaderState, uhz, java.util.List, boolean, java.util.Map, tsr, boolean, java.util.List, boolean):uha");
    }

    private static void h(uhd uhdVar, uip uipVar, ujf ujfVar, toc tocVar, int i) {
        if (uipVar.g.d() == 0 || !uipVar.g()) {
            return;
        }
        List listF = uipVar.f();
        ujl ujlVar = new ujl(uipVar.a, uipVar.b, uipVar.c, uipVar.d, (toq[]) listF.toArray(new toq[listF.size()]), uipVar.j, ukf.a, uipVar.v, 0, 0, 0, 1, null, null, null, null, uipVar.s, tocVar, uipVar.o, null, uipVar.q, false, i);
        if (ujlVar.e.length > 0) {
            ((ArrayList) yrm.an(uhdVar.a)).add(new uhf(ujlVar, ujfVar, umo.g(ujlVar, ujfVar), 2));
        }
    }

    private static void i(int[] iArr, int[] iArr2, int i, boolean z, aeiy aeiyVar) {
        for (int i2 : iArr2) {
            int i3 = i2 + i2;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            if (z) {
                aeiyVar.c(Float.floatToIntBits(i4));
                aeiyVar.c(Float.floatToIntBits(i5));
            } else {
                aeiyVar.c((i5 << 16) | ((char) i4));
            }
            aeiyVar.c(i);
        }
    }

    private static void j(int[] iArr, int i, boolean z, aeiy aeiyVar) {
        for (int i2 = 0; i2 < (iArr.length >> 1); i2++) {
            int i3 = i2 + i2;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            if (z) {
                aeiyVar.c(Float.floatToIntBits(i4));
                aeiyVar.c(Float.floatToIntBits(i5));
            } else {
                aeiyVar.c((i5 << 16) | ((char) i4));
            }
            aeiyVar.c(i);
        }
    }

    @Override // defpackage.uhc
    public final int a() {
        return this.d;
    }

    @Override // defpackage.uhc
    public final int b() {
        return 156;
    }
}
