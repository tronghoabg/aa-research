package A5;

import E5.A0;
import E5.C0442b0;
import E5.C0446d0;
import E5.C0448e0;
import E5.C0450f0;
import E5.C0465o;
import E5.D0;
import E5.F0;
import E5.H0;
import E5.I0;
import E5.InterfaceC0451g;
import E5.InterfaceC0453h;
import E5.K0;
import E5.Q;
import E5.S;
import E5.T;
import E5.U;
import E5.V;
import E5.W;
import E5.X;
import E5.Z;
import E5.p0;
import E5.u0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.qonversion.android.sdk.internal.Constants;
import g6.C2711b;
import java.util.ArrayList;
import k8.InterfaceC3199h;
import ka.AbstractC3256n;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import ne.C3618a;
import t5.C4114i;
import u6.AbstractC4256a;
import u6.q;
import u6.v;
import v6.C4303b;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements k, SuccessContinuation, Continuation, InterfaceC3199h, u6.g, InterfaceC0451g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f355a;

    public /* synthetic */ f(int i5) {
        this.f355a = i5;
    }

    @Override // A5.k, k8.InterfaceC3199h
    public Object apply(Object obj) {
        switch (this.f355a) {
            case 0:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C3618a c3618aA = C4114i.a();
                        c3618aA.h(cursorRawQuery.getString(1));
                        c3618aA.f41022c = D5.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c3618aA.f41021b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c3618aA.c());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return new F5.f((q) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v174, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v34, types: [boolean[], java.io.Serializable] */
    @Override // E5.InterfaceC0451g
    public InterfaceC0453h e(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        e0 e0VarS;
        int i5 = 4;
        boolean z2 = true;
        switch (this.f355a) {
            case 7:
                S s10 = new S();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC4256a.class.getClassLoader();
                    int i10 = v.f46721a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                T t10 = T.f3220G;
                String str = t10.f3228a;
                if (string == null) {
                    string = str;
                }
                s10.f3195a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = t10.f3229b;
                }
                s10.f3196b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = t10.f3230c;
                }
                s10.f3197c = string3;
                s10.f3198d = bundle.getInt(Integer.toString(3, 36), t10.f3231d);
                s10.f3199e = bundle.getInt(Integer.toString(4, 36), t10.f3232e);
                s10.f3200f = bundle.getInt(Integer.toString(5, 36), t10.f3233f);
                s10.f3201g = bundle.getInt(Integer.toString(6, 36), t10.f3234g);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = t10.f3236i;
                }
                s10.f3202h = string4;
                W5.c cVar = (W5.c) bundle.getParcelable(Integer.toString(8, 36));
                if (cVar == null) {
                    cVar = t10.f3237j;
                }
                s10.f3203i = cVar;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = t10.k;
                }
                s10.f3204j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = t10.f3238l;
                }
                s10.k = string6;
                s10.f3205l = bundle.getInt(Integer.toString(11, 36), t10.f3239m);
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + Constants.USER_ID_SEPARATOR + Integer.toString(i11, 36));
                    if (byteArray == null) {
                        s10.f3206m = arrayList;
                        s10.f3207n = (I5.c) bundle.getParcelable(Integer.toString(13, 36));
                        s10.f3208o = bundle.getLong(Integer.toString(14, 36), t10.f3242p);
                        s10.f3209p = bundle.getInt(Integer.toString(15, 36), t10.f3243q);
                        s10.f3210q = bundle.getInt(Integer.toString(16, 36), t10.f3244r);
                        s10.f3211r = bundle.getFloat(Integer.toString(17, 36), t10.f3245s);
                        s10.f3212s = bundle.getInt(Integer.toString(18, 36), t10.f3246t);
                        s10.f3213t = bundle.getFloat(Integer.toString(19, 36), t10.f3247u);
                        s10.f3214u = bundle.getByteArray(Integer.toString(20, 36));
                        s10.f3215v = bundle.getInt(Integer.toString(21, 36), t10.f3249w);
                        Bundle bundle4 = bundle.getBundle(Integer.toString(22, 36));
                        if (bundle4 != null) {
                            s10.f3216w = new C4303b(bundle4.getInt(Integer.toString(0, 36), -1), bundle4.getByteArray(Integer.toString(3, 36)), bundle4.getInt(Integer.toString(1, 36), -1), bundle4.getInt(Integer.toString(2, 36), -1));
                        }
                        s10.f3217x = bundle.getInt(Integer.toString(23, 36), t10.f3251y);
                        s10.f3218y = bundle.getInt(Integer.toString(24, 36), t10.f3252z);
                        s10.f3219z = bundle.getInt(Integer.toString(25, 36), t10.f3222A);
                        s10.f3191A = bundle.getInt(Integer.toString(26, 36), t10.f3223B);
                        s10.f3192B = bundle.getInt(Integer.toString(27, 36), t10.f3224C);
                        s10.f3193C = bundle.getInt(Integer.toString(28, 36), t10.f3225D);
                        s10.f3194D = bundle.getInt(Integer.toString(29, 36), t10.f3226E);
                        return new T(s10);
                    }
                    arrayList.add(byteArray);
                    i11++;
                }
            case 8:
                AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new U(bundle.getBoolean(Integer.toString(2, 36), false)) : new U();
            case 9:
                String string7 = bundle.getString(Integer.toString(0, 36), "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                Z z10 = bundle5 == null ? Z.f3272f : new Z(bundle5.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle6 = bundle.getBundle(Integer.toString(2, 36));
                C0450f0 c0450f0 = bundle6 == null ? C0450f0.f3356G : (C0450f0) C0450f0.f3357H.e(bundle6);
                Bundle bundle7 = bundle.getBundle(Integer.toString(3, 36));
                X x5 = bundle7 == null ? X.f3266g : (X) W.f3260f.e(bundle7);
                Bundle bundle8 = bundle.getBundle(Integer.toString(4, 36));
                return new C0446d0(string7, x5, null, z10, c0450f0, bundle8 == null ? C0442b0.f3293c : (C0442b0) C0442b0.f3294d.e(bundle8));
            case 10:
                V v2 = new V();
                long j8 = bundle.getLong(Integer.toString(0, 36), 0L);
                AbstractC4256a.e(j8 >= 0);
                v2.f3255a = j8;
                long j10 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j10 != Long.MIN_VALUE && j10 < 0) {
                    z2 = false;
                }
                AbstractC4256a.e(z2);
                v2.f3256b = j10;
                v2.f3257c = bundle.getBoolean(Integer.toString(2, 36), false);
                v2.f3258d = bundle.getBoolean(Integer.toString(3, 36), false);
                v2.f3259e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new X(v2);
            case 11:
                return new Z(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            case 12:
                G9.e eVar = new G9.e(i5);
                eVar.f4685b = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                eVar.f4686c = bundle.getString(Integer.toString(1, 36));
                eVar.f4687d = bundle.getBundle(Integer.toString(2, 36));
                return new C0442b0(eVar);
            case 13:
                C0448e0 c0448e0 = new C0448e0();
                c0448e0.f3320a = bundle.getCharSequence(Integer.toString(0, 36));
                c0448e0.f3321b = bundle.getCharSequence(Integer.toString(1, 36));
                c0448e0.f3322c = bundle.getCharSequence(Integer.toString(2, 36));
                c0448e0.f3323d = bundle.getCharSequence(Integer.toString(3, 36));
                c0448e0.f3324e = bundle.getCharSequence(Integer.toString(4, 36));
                c0448e0.f3325f = bundle.getCharSequence(Integer.toString(5, 36));
                c0448e0.f3326g = bundle.getCharSequence(Integer.toString(6, 36));
                byte[] byteArray2 = bundle.getByteArray(Integer.toString(10, 36));
                Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                c0448e0.f3329j = byteArray2 == null ? null : (byte[]) byteArray2.clone();
                c0448e0.k = numValueOf;
                c0448e0.f3330l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                c0448e0.f3341w = bundle.getCharSequence(Integer.toString(22, 36));
                c0448e0.f3342x = bundle.getCharSequence(Integer.toString(23, 36));
                c0448e0.f3343y = bundle.getCharSequence(Integer.toString(24, 36));
                c0448e0.f3316B = bundle.getCharSequence(Integer.toString(27, 36));
                c0448e0.f3317C = bundle.getCharSequence(Integer.toString(28, 36));
                c0448e0.f3318D = bundle.getCharSequence(Integer.toString(30, 36));
                c0448e0.f3319E = bundle.getBundle(Integer.toString(1000, 36));
                boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
                f fVar = A0.f3008a;
                if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    c0448e0.f3327h = (A0) fVar.e(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    c0448e0.f3328i = (A0) fVar.e(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    c0448e0.f3331m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    c0448e0.f3332n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    c0448e0.f3333o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    c0448e0.f3334p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    c0448e0.f3335q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    c0448e0.f3336r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    c0448e0.f3337s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    c0448e0.f3338t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    c0448e0.f3339u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    c0448e0.f3340v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    c0448e0.f3344z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    c0448e0.f3315A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new C0450f0(c0448e0);
            case 14:
                AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f10 == -1.0f ? new p0() : new p0(f10);
            case 15:
                int i12 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i12 == 0) {
                    AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new U(bundle.getBoolean(Integer.toString(2, 36), false)) : new U();
                }
                if (i12 == 1) {
                    AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f11 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    return f11 == -1.0f ? new p0() : new p0(f11);
                }
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalArgumentException(AbstractC3256n.g(i12, "Unknown RatingType: "));
                    }
                    AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new F0(bundle.getBoolean(Integer.toString(2, 36), false)) : new F0();
                }
                AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i13 = bundle.getInt(Integer.toString(1, 36), 5);
                float f12 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f12 == -1.0f ? new D0(i13) : new D0(i13, f12);
            case 16:
                AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i14 = bundle.getInt(Integer.toString(1, 36), 5);
                float f13 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f13 == -1.0f ? new D0(i14) : new D0(i14, f13);
            case 17:
                AbstractC4256a.e(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new F0(bundle.getBoolean(Integer.toString(2, 36), false)) : new F0();
            case 18:
                int i15 = bundle.getInt(Integer.toString(0, 36), 0);
                long j11 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j12 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z11 = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle9 = bundle.getBundle(Integer.toString(4, 36));
                C2711b c2711b = bundle9 != null ? (C2711b) C2711b.f35769h.e(bundle9) : C2711b.f35767f;
                H0 h02 = new H0();
                h02.h(null, null, i15, j11, j12, c2711b, z11);
                return h02;
            case 19:
                Bundle bundle10 = bundle.getBundle(Integer.toString(1, 36));
                C0446d0 c0446d0 = bundle10 != null ? (C0446d0) C0446d0.f3303g.e(bundle10) : null;
                long j13 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j14 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j15 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z12 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z13 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle11 = bundle.getBundle(Integer.toString(7, 36));
                Z z14 = bundle11 != null ? new Z(bundle11.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle11.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle11.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle11.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle11.getFloat(Integer.toString(4, 36), -3.4028235E38f)) : null;
                boolean z15 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j16 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j17 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i16 = bundle.getInt(Integer.toString(11, 36), 0);
                int i17 = bundle.getInt(Integer.toString(12, 36), 0);
                long j18 = bundle.getLong(Integer.toString(13, 36), 0L);
                I0 i02 = new I0();
                i02.b(I0.f3108r, c0446d0, j13, j14, j15, z12, z13, z14, j16, j17, i16, i17, j18);
                i02.k = z15;
                return i02;
            default:
                Bundle bundle12 = bundle.getBundle(Integer.toString(0, 36));
                bundle12.getClass();
                ArrayList parcelableArrayList = bundle12.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    C3407I c3407i = AbstractC3409K.f40056b;
                    e0VarS = e0.f40101e;
                } else {
                    e0VarS = AbstractC4256a.s(T.f3221H, parcelableArrayList);
                }
                f6.Z z16 = new f6.Z(bundle12.getString(Integer.toString(1, 36), ""), (T[]) e0VarS.toArray(new T[0]));
                ?? intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i18 = z16.f35017a;
                return new K0(z16, bundle.getBoolean(Integer.toString(4, 36), false), (int[]) Ba.c.s(intArray, new int[i18]), (boolean[]) Ba.c.s(bundle.getBooleanArray(Integer.toString(3, 36)), new boolean[i18]));
        }
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f355a) {
            case 4:
                ((u0) obj).y(new C0465o(2, new Q("Player release timed out.", 0), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                break;
            case 5:
                ((u0) obj).B();
                break;
            case 6:
                ((u0) obj).w();
                break;
            case 21:
                ((F5.j) obj).getClass();
                break;
            case 22:
                ((F5.j) obj).getClass();
                break;
            case 23:
                ((F5.j) obj).getClass();
                break;
            case 24:
                ((F5.j) obj).getClass();
                break;
            case 25:
                ((F5.j) obj).getClass();
                break;
            case 26:
                ((F5.j) obj).getClass();
                break;
            case 27:
                ((F5.j) obj).getClass();
                break;
            case 28:
                ((F5.j) obj).getClass();
                break;
            default:
                ((F5.j) obj).getClass();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(C8.b.a((C8.a) obj));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return task.isSuccessful() ? Tasks.forResult(C8.c.a((C8.b) task.getResult())) : Tasks.forResult(new C8.c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new s8.j(task.getException().getMessage(), task.getException())));
    }
}
