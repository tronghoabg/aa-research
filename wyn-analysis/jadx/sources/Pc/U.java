package Pc;

import J9.C0664x;
import K8.C0694f;
import K8.C0698j;
import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;

/* loaded from: classes5.dex */
public final class U implements InterfaceC4272i {
    public static final HashMap k = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f9376a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseAuth f9377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9378c;

    /* renamed from: d, reason: collision with root package name */
    public final J8.z f9379d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9380e;

    /* renamed from: f, reason: collision with root package name */
    public final C0664x f9381f;

    /* renamed from: g, reason: collision with root package name */
    public final C0698j f9382g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9383h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f9384i;

    /* renamed from: j, reason: collision with root package name */
    public C4271h f9385j;

    public U(Activity activity, C0797m c0797m, Q q4, C0698j c0698j, J8.z zVar, C0664x c0664x) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f9376a = atomicReference;
        atomicReference.set(activity);
        this.f9382g = c0698j;
        this.f9379d = zVar;
        this.f9377b = C0788d.a(c0797m);
        this.f9378c = q4.f9366a;
        long jLongValue = q4.f9367b.longValue();
        int i5 = (int) jLongValue;
        if (jLongValue != i5) {
            throw new ArithmeticException();
        }
        this.f9380e = i5;
        String str = q4.f9369d;
        if (str != null) {
            this.f9383h = str;
        }
        Long l10 = q4.f9368c;
        if (l10 != null) {
            long jLongValue2 = l10.longValue();
            int i10 = (int) jLongValue2;
            if (jLongValue2 != i10) {
                throw new ArithmeticException();
            }
            this.f9384i = Integer.valueOf(i10);
        }
        this.f9381f = c0664x;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        this.f9385j = null;
        this.f9376a.set(null);
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        J8.w wVar;
        this.f9385j = (C4271h) interfaceC4270g;
        T t10 = new T(this);
        String str = this.f9383h;
        String str2 = this.f9378c;
        FirebaseAuth firebaseAuth = this.f9377b;
        if (str != null) {
            C0694f c0694f = firebaseAuth.f27289g;
            c0694f.f6641c = str2;
            c0694f.f6642d = str;
        }
        AbstractC1732v.i(firebaseAuth);
        Activity activity = (Activity) this.f9376a.get();
        String str3 = str2 != null ? str2 : null;
        C0698j c0698j = this.f9382g;
        C0698j c0698j2 = c0698j != null ? c0698j : null;
        J8.z zVar = this.f9379d;
        J8.z zVar2 = zVar != null ? zVar : null;
        long jConvert = TimeUnit.SECONDS.convert(this.f9380e, TimeUnit.MILLISECONDS);
        Long lValueOf = Long.valueOf(jConvert);
        Integer num = this.f9384i;
        J8.w wVar2 = (num == null || (wVar = (J8.w) k.get(num)) == null) ? null : wVar;
        if (jConvert < 0 || jConvert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        if (c0698j2 == null) {
            AbstractC1732v.g(str3, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
            AbstractC1732v.a("A phoneMultiFactorInfo must be set for second factor sign-in.", zVar2 == null);
        } else if (c0698j2.f6652a != null) {
            AbstractC1732v.f(str3);
            AbstractC1732v.a("Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.", zVar2 == null);
        } else {
            AbstractC1732v.a("A phoneMultiFactorInfo must be set for second factor sign-in.", zVar2 != null);
            AbstractC1732v.a("A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.", str3 == null);
        }
        FirebaseAuth.j(new J8.v(firebaseAuth, lValueOf, t10, firebaseAuth.f27281A, str3, activity, wVar2, c0698j2, zVar2));
    }
}
