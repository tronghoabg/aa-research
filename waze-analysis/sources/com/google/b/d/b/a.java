package com.google.b.d.b;

import android.text.TextUtils;
import com.google.d.d.bq;
import com.google.d.d.bs;
import com.google.d.d.ci;
import com.google.d.d.fu;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class a implements x {

    /* renamed from: a, reason: collision with root package name */
    private final x f7063a;

    /* renamed from: b, reason: collision with root package name */
    private final UUID f7064b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7065c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7066d;

    /* renamed from: e, reason: collision with root package name */
    private Thread f7067e;

    a(String str, x xVar, w wVar) {
        this.f7066d = str;
        this.f7063a = xVar;
        this.f7064b = xVar.f();
        this.f7065c = xVar.d();
        ai aiVar = wVar.f7138c;
        this.f7067e = Thread.currentThread();
    }

    public static String bo(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.b.d.b.x
    public final x a() {
        return this.f7063a;
    }

    @Override // com.google.b.d.b.x
    public final String c() {
        return this.f7066d;
    }

    @Override // com.google.b.d.b.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVarA = j.a();
        x xVar = wVarA.f7137b;
        if (xVar == null) {
            throw new g("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == xVar) {
            j.c(wVarA, xVar.a());
            this.f7067e = null;
            return;
        }
        throw new h("Tried to end span " + c() + ", but that span is not the current span. The current span is " + xVar.c() + ".");
    }

    @Override // com.google.b.d.b.x
    public final String d() {
        return this.f7065c;
    }

    @Override // com.google.b.d.b.x
    public final Thread e() {
        return this.f7067e;
    }

    @Override // com.google.b.d.b.x
    public final UUID f() {
        return this.f7064b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.b.d.b.a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.b.d.b.x] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.b.d.b.x] */
    public final String toString() {
        String str;
        int i2 = j.f7093a;
        x xVarA = this;
        int i3 = 0;
        int length = 0;
        while (xVarA != null) {
            i3++;
            length += xVarA.c().length();
            xVarA = xVarA.a();
            if (xVarA != null) {
                length += 4;
            }
        }
        if (i3 > 250) {
            String[] strArr = new String[i3];
            x xVarA2 = this;
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                strArr[i4] = xVarA2.c();
                xVarA2 = xVarA2.a();
            }
            bq bqVar = new bq();
            fu fuVarListIterator = ci.n(strArr).listIterator();
            int i5 = 0;
            while (fuVarListIterator.hasNext()) {
                bqVar.d(fuVarListIterator.next(), Integer.valueOf(i5));
                i5++;
            }
            bs bsVarB = bqVar.b();
            int i6 = i3 >> 2;
            u uVar = null;
            if (bsVarB.size() <= i6) {
                int[] iArr = new int[i3 + 1];
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr[i7] = ((Integer) bsVarB.get(strArr[i7])).intValue();
                }
                iArr[i3] = bsVarB.size();
                u uVarA = v.b(iArr).a();
                if (uVarA.f7129c * (uVarA.f7128b - uVarA.f7127a) >= i6) {
                    uVar = uVarA;
                }
            }
            str = "";
            if (uVar != null) {
                int i8 = uVar.f7127a;
                String strConcat = i8 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i8))).concat(" -> ") : "";
                int i9 = uVar.f7128b;
                int i10 = uVar.f7129c;
                int i11 = ((i9 - i8) * i10) + i8;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i8, i9)), Integer.valueOf(i10), i11 < i3 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i11, i3)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        while (this != 0) {
            String strC = this.c();
            length -= strC.length();
            strC.getChars(0, strC.length(), cArr, length);
            this = this.a();
            if (this != 0) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    a(String str, UUID uuid, String str2, w wVar) {
        this.f7066d = str;
        this.f7063a = null;
        this.f7064b = uuid;
        this.f7065c = str2;
        ai aiVar = wVar.f7138c;
        this.f7067e = Thread.currentThread();
    }
}
