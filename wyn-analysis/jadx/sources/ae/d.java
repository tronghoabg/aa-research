package ae;

import A.C0230x;
import F6.p;
import N1.D;
import S1.i;
import S1.u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.InterfaceC1731u;
import com.google.android.gms.tasks.OnFailureListener;
import f4.C2556c;
import f4.C2557d;
import f4.InterfaceC2562i;
import ff.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o2.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.r;
import u0.w0;
import u1.C4212a;
import u1.InterfaceC4213b;
import w.AbstractC4346a;
import w.AbstractC4348c;
import w.C4347b;

/* loaded from: classes5.dex */
public final class d implements InterfaceC1731u, InterfaceC2562i, DatabaseErrorHandler, r, InterfaceC4213b, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17636a;

    public /* synthetic */ d(int i5) {
        this.f17636a = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[PHI: r13
  0x0094: PHI (r13v7 com.moloco.sdk.internal.publisher.nativead.model.e) = (r13v3 com.moloco.sdk.internal.publisher.nativead.model.e), (r13v5 com.moloco.sdk.internal.publisher.nativead.model.e) binds: [B:36:0x0092, B:42:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(org.json.JSONArray r17) throws org.json.JSONException {
        /*
            r0 = r17
            if (r0 != 0) goto L7
            ff.v r0 = ff.v.f35432a
            return r0
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto Le4
            org.json.JSONObject r5 = r0.getJSONObject(r4)
            java.lang.String r6 = "id"
            boolean r7 = r5.has(r6)
            if (r7 == 0) goto Le0
            int r6 = r5.getInt(r6)
            java.lang.String r7 = "required"
            int r7 = r5.optInt(r7, r3)
            r8 = 1
            if (r7 != r8) goto L2e
            goto L2f
        L2e:
            r8 = r3
        L2f:
            java.lang.String r7 = "title"
            org.json.JSONObject r7 = r5.optJSONObject(r7)
            java.lang.String r9 = "len"
            java.lang.String r10 = "getString(...)"
            r11 = 0
            if (r7 != 0) goto L3e
            r12 = r11
            goto L55
        L3e:
            com.moloco.sdk.internal.publisher.nativead.model.c r12 = new com.moloco.sdk.internal.publisher.nativead.model.c
            java.lang.String r13 = "text"
            java.lang.String r13 = r7.getString(r13)
            kotlin.jvm.internal.AbstractC3340k.d(r13, r10)
            boolean r14 = r7.has(r9)
            if (r14 == 0) goto L52
            r7.getInt(r9)
        L52:
            r12.<init>(r6, r13, r8)
        L55:
            if (r12 == 0) goto L59
            goto Ldb
        L59:
            java.lang.String r7 = "img"
            org.json.JSONObject r7 = r5.optJSONObject(r7)
            java.lang.String r12 = "type"
            if (r7 != 0) goto L65
            r13 = r11
            goto L92
        L65:
            com.moloco.sdk.internal.publisher.nativead.model.b r13 = new com.moloco.sdk.internal.publisher.nativead.model.b
            boolean r14 = r7.has(r12)
            if (r14 == 0) goto L70
            r7.getInt(r12)
        L70:
            java.lang.String r14 = "url"
            java.lang.String r14 = r7.getString(r14)
            kotlin.jvm.internal.AbstractC3340k.d(r14, r10)
            java.lang.String r15 = "w"
            boolean r16 = r7.has(r15)
            if (r16 == 0) goto L84
            r7.getInt(r15)
        L84:
            java.lang.String r15 = "h"
            boolean r16 = r7.has(r15)
            if (r16 == 0) goto L8f
            r7.getInt(r15)
        L8f:
            r13.<init>(r6, r14, r8)
        L92:
            if (r13 == 0) goto L96
        L94:
            r12 = r13
            goto Ldb
        L96:
            java.lang.String r7 = "video"
            org.json.JSONObject r7 = r5.optJSONObject(r7)
            if (r7 != 0) goto La0
            r13 = r11
            goto Lae
        La0:
            com.moloco.sdk.internal.publisher.nativead.model.d r13 = new com.moloco.sdk.internal.publisher.nativead.model.d
            java.lang.String r14 = "vasttag"
            java.lang.String r7 = r7.getString(r14)
            kotlin.jvm.internal.AbstractC3340k.d(r7, r10)
            r13.<init>(r6, r7, r8)
        Lae:
            if (r13 == 0) goto Lb1
            goto L94
        Lb1:
            java.lang.String r7 = "data"
            org.json.JSONObject r5 = r5.optJSONObject(r7)
            if (r5 != 0) goto Lba
            goto Lda
        Lba:
            com.moloco.sdk.internal.publisher.nativead.model.a r11 = new com.moloco.sdk.internal.publisher.nativead.model.a
            boolean r7 = r5.has(r12)
            if (r7 == 0) goto Lc5
            r5.getInt(r12)
        Lc5:
            boolean r7 = r5.has(r9)
            if (r7 == 0) goto Lce
            r5.getInt(r9)
        Lce:
            java.lang.String r7 = "value"
            java.lang.String r5 = r5.getString(r7)
            kotlin.jvm.internal.AbstractC3340k.d(r5, r10)
            r11.<init>(r6, r5, r8)
        Lda:
            r12 = r11
        Ldb:
            if (r12 == 0) goto Le0
            r1.add(r12)
        Le0:
            int r4 = r4 + 1
            goto L12
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.d.d(org.json.JSONArray):java.util.List");
    }

    public static List e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return v.f35432a;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            arrayList.add(new com.moloco.sdk.internal.publisher.nativead.model.f(jSONObject.getInt("event"), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public static U5.f f(p pVar, C0230x c0230x) {
        IOException iOException = (IOException) c0230x.f188c;
        if (!(iOException instanceof u)) {
            return null;
        }
        int i5 = ((u) iOException).f10908d;
        if (i5 != 403 && i5 != 404 && i5 != 410 && i5 != 416 && i5 != 500 && i5 != 503) {
            return null;
        }
        if (pVar.a(1)) {
            return new U5.f(1, 300000L);
        }
        if (pVar.a(2)) {
            return new U5.f(2, 60000L);
        }
        return null;
    }

    public static long h(C0230x c0230x) {
        Throwable cause = (IOException) c0230x.f188c;
        if ((cause instanceof D) || (cause instanceof FileNotFoundException) || (cause instanceof S1.r) || (cause instanceof l)) {
            return -9223372036854775807L;
        }
        int i5 = i.f10862b;
        while (cause != null) {
            if ((cause instanceof i) && ((i) cause).f10863a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c0230x.f187b - 1) * 1000, 5000);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1731u
    public /* bridge */ /* synthetic */ Object a(t tVar) {
        return null;
    }

    public int g(int i5) {
        switch (this.f17636a) {
            case 10:
                if (i5 == 7) {
                }
                break;
            default:
                if (i5 == 7) {
                }
                break;
        }
        return 3;
    }

    public void i(w0 w0Var, float f10) {
        C4347b c4347b = (C4347b) ((Drawable) w0Var.f46405a);
        AbstractC4346a abstractC4346a = (AbstractC4346a) w0Var.f46406b;
        boolean useCompatPadding = abstractC4346a.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC4346a.getPreventCornerOverlap();
        if (f10 != c4347b.f47261e || c4347b.f47262f != useCompatPadding || c4347b.f47263g != preventCornerOverlap) {
            c4347b.f47261e = f10;
            c4347b.f47262f = useCompatPadding;
            c4347b.f47263g = preventCornerOverlap;
            c4347b.b(null);
            c4347b.invalidateSelf();
        }
        if (!abstractC4346a.getUseCompatPadding()) {
            w0Var.a(0, 0, 0, 0);
            return;
        }
        C4347b c4347b2 = (C4347b) ((Drawable) w0Var.f46405a);
        float f11 = c4347b2.f47261e;
        float f12 = c4347b2.f47257a;
        int iCeil = (int) Math.ceil(AbstractC4348c.a(f11, f12, abstractC4346a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC4348c.b(f11, f12, abstractC4346a.getPreventCornerOverlap()));
        w0Var.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // f4.InterfaceC2562i
    public C2557d m(C2556c c2556c) {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // q2.r
    public void B() {
    }

    @Override // q2.r
    public void q() {
    }

    @Override // f4.InterfaceC2562i
    public void b(int i5) {
    }

    @Override // net.zetetic.database.DatabaseErrorHandler
    public void c(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // u1.InterfaceC4213b
    public Object u(C4212a c4212a) throws C4212a {
        throw c4212a;
    }

    @Override // f4.InterfaceC2562i
    public void r(C2556c c2556c, Bitmap bitmap, Map map, int i5) {
    }
}
