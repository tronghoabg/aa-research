package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.text.Layout;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class okv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public okv(Layout layout) {
        this.c = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iD = afyh.D(((Layout) this.c).getText(), '\n', length);
            length = iD < 0 ? ((Layout) this.c).getText().length() : iD + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.c).getText().length());
        this.d = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.b = arrayList2;
        this.a = new boolean[this.d.size()];
        this.d.size();
    }

    private static final boolean k(lod lodVar, String str) {
        return lodVar.a().getBoolean(str, false);
    }

    private final float l(int i, boolean z) {
        Layout layout = (Layout) this.c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final void a(File file, String str) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Object obj = this.e;
                obj.getClass();
                ((FileOutputStream) obj).write(String.format(Locale.US, "---------- %s ----------\n\n", str).getBytes(StandardCharsets.UTF_8));
                Object obj2 = this.e;
                obj2.getClass();
                yts.a(fileInputStream, (OutputStream) obj2);
                fileInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            ((ype) ((ype) ((yns) this.a).h()).ai((char) 5981)).y("Failure to write info for header: %s", str);
            throw new IOException("IO error dumping output stream", e);
        }
    }

    public final lkc b(lod lodVar) {
        return lodVar.i.d((yzz) this.a);
    }

    public final ltg c(ltc ltcVar, ltg ltgVar, lod lodVar, AaPlaybackState aaPlaybackState, List list) {
        if (lem.b(aaPlaybackState, ltcVar.c)) {
            return ltgVar;
        }
        String str = ltcVar.d;
        String str2 = ltcVar.e;
        boolean zK = k(lodVar, str);
        boolean zK2 = k(lodVar, str2);
        if (zK2) {
            ComponentName componentName = lodVar.c.a;
        }
        if (zK || zK2) {
            return new ltg(ltgVar.a, false, ltgVar.c);
        }
        if (list.isEmpty()) {
            return null;
        }
        AaPlaybackState.AaCustomAction aaCustomAction = (AaPlaybackState.AaCustomAction) list.remove(0);
        int iO = aaCustomAction.O();
        String str3 = lodVar.c.b;
        str3.getClass();
        return new ltg(GhIcon.r(str3, iO), true, new kku(this, aaCustomAction, 12));
    }

    public final void d(AaPlaybackState.AaCustomAction aaCustomAction) {
        Object obj = this.e;
        if (obj == null) {
            throw new IllegalStateException("Action executed after connection lost");
        }
        b((lod) obj).f(aaCustomAction, aaCustomAction.n());
    }

    public final float e(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (!z2) {
            return l(i, z);
        }
        Layout layout = (Layout) this.c;
        int iF = dao.f(layout, i);
        int lineStart = layout.getLineStart(iF);
        int lineEnd = layout.getLineEnd(iF);
        if (i != lineStart && i != lineEnd) {
            return l(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return l(i, z);
        }
        boolean z3 = true;
        int iF2 = f(i, true);
        boolean zJ = j(iF2);
        int iH = h(lineEnd, lineStart);
        int iG = g(iF2);
        int i4 = lineStart - iG;
        int i5 = iH - iG;
        Bidi bidiI = i(iF2);
        Bidi bidiCreateLineBidi = bidiI != null ? bidiI.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (!z && zJ != zIsRtlCharAt) {
                z3 = zJ;
            } else if (zJ) {
                z3 = false;
            }
            return (i != lineStart ? z3 : !z3) ? layout.getLineRight(iF) : layout.getLineLeft(iF);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        dgc[] dgcVarArr = new dgc[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            dgcVarArr[i6] = new dgc(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, dgcVarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (dgcVarArr[i8].a == i) {
                    break;
                }
                i8++;
            }
            dgc dgcVar = dgcVarArr[i8];
            if (z || zJ == dgcVar.c) {
                zJ = !zJ;
            }
            if (i8 != 0) {
                i3 = i8;
            } else {
                if (zJ) {
                    return layout.getLineLeft(iF);
                }
                i3 = 0;
            }
            return (i3 != runCount + (-1) || zJ) ? zJ ? layout.getPrimaryHorizontal(dgcVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(dgcVarArr[i3 + 1].a) : layout.getLineRight(iF);
        }
        int iH2 = i > iH ? h(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i9 = -1;
                break;
            }
            if (dgcVarArr[i9].b == iH2) {
                break;
            }
            i9++;
        }
        dgc dgcVar2 = dgcVarArr[i9];
        if (!z && zJ != dgcVar2.c) {
            zJ = !zJ;
        }
        if (i9 != 0) {
            i2 = i9;
        } else {
            if (zJ) {
                return layout.getLineLeft(iF);
            }
            i2 = 0;
        }
        return (i2 != runCount + (-1) || zJ) ? zJ ? layout.getPrimaryHorizontal(dgcVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(dgcVarArr[i2 + 1].b) : layout.getLineRight(iF);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final int f(int i, boolean z) {
        ?? r1 = this.d;
        int iCs = woy.cs(r1, Integer.valueOf(i));
        int i2 = iCs < 0 ? -(iCs + 1) : iCs + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) r1.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final int g(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.d.get(i - 1)).intValue();
    }

    public final int h(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char cCharAt = ((Layout) this.c).getText().charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (affa.b(cCharAt, 8192) >= 0 && affa.b(cCharAt, 8202) <= 0) {
                    if (cCharAt == 8199) {
                        cCharAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (cCharAt != 8287 && cCharAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi i(int r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.a
            boolean[] r0 = (boolean[]) r0
            boolean r1 = r0[r13]
            if (r1 == 0) goto L11
            java.lang.Object r12 = r12.b
            java.lang.Object r12 = r12.get(r13)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L11:
            r1 = 0
            if (r13 != 0) goto L16
            r2 = r1
            goto L24
        L16:
            java.lang.Object r2 = r12.d
            int r3 = r13 + (-1)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L24:
            java.lang.Object r3 = r12.d
            java.lang.Object r3 = r3.get(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r9 = r3 - r2
            java.lang.Object r4 = r12.e
            if (r4 == 0) goto L3c
            r5 = r4
            char[] r5 = (char[]) r5
            int r5 = r5.length
            if (r5 >= r9) goto L3e
        L3c:
            char[] r4 = new char[r9]
        L3e:
            r11 = r4
            java.lang.Object r4 = r12.c
            android.text.Layout r4 = (android.text.Layout) r4
            java.lang.CharSequence r4 = r4.getText()
            r5 = r11
            char[] r5 = (char[]) r5
            android.text.TextUtils.getChars(r4, r2, r3, r5, r1)
            boolean r1 = java.text.Bidi.requiresBidi(r5, r1, r9)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L67
            boolean r10 = r12.j(r13)
            java.text.Bidi r4 = new java.text.Bidi
            r7 = 0
            r8 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r1 = r4.getRunCount()
            if (r1 != r2) goto L68
        L67:
            r4 = r3
        L68:
            java.lang.Object r1 = r12.b
            r1.set(r13, r4)
            r0[r13] = r2
            if (r4 == 0) goto L78
            java.lang.Object r13 = r12.e
            if (r11 != r13) goto L77
            r11 = r3
            goto L78
        L77:
            r11 = r13
        L78:
            r12.e = r11
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okv.i(int):java.text.Bidi");
    }

    public final boolean j(int i) {
        int iG = g(i);
        Layout layout = (Layout) this.c;
        return layout.getParagraphDirection(layout.getLineForOffset(iG)) == -1;
    }

    public okv(eqj eqjVar, yzz yzzVar, GhIcon ghIcon, GhIcon ghIcon2, GhIcon ghIcon3, GhIcon ghIcon4, eqj eqjVar2) {
        this.a = yzzVar;
        yph.c("GH.ActionHelper");
        afco afcoVar = tby.a;
        int i = 0;
        eqj eqjVarG = tby.G(eqy.c(tby.v(eqjVar, new ltd(this, 1, null)), new ltd(new lta(i), i)), eqjVar2, new ltb(this, ghIcon3, ghIcon4, ghIcon, ghIcon2, 0));
        this.b = tby.w(eqjVarG, new lta(2));
        this.d = tby.w(eqjVarG, new lta(3));
        this.c = tby.v(eqjVarG, new lta(4));
    }

    public okv(Context context, rxo rxoVar) {
        xyc xycVarL = wub.L(new joa(11));
        this.a = yph.c("GH.BR.HANDLER");
        this.c = context;
        this.b = rxoVar;
        this.d = xycVarL;
    }
}
