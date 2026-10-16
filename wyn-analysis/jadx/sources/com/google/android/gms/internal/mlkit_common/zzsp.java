package com.google.android.gms.internal.mlkit_common;

import L8.p;
import O9.b;
import android.content.Context;
import q5.AbstractC3869d;
import q5.C3866a;
import q5.C3868c;
import q5.EnumC3870e;
import q5.InterfaceC3871f;
import r5.C3924a;
import t5.C4121p;
import t5.C4122q;
import t5.C4123r;

/* loaded from: classes4.dex */
public final class zzsp implements zzrz {
    private b zza;
    private final b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        C3924a c3924a = C3924a.f44362e;
        C4123r.b(context);
        final C4121p c4121pC = C4123r.a().c(c3924a);
        if (C3924a.f44361d.contains(new C3868c("json"))) {
            this.zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // O9.b
                public final Object get() {
                    return ((C4121p) c4121pC).a("FIREBASE_ML_SDK", new C3868c("json"), new InterfaceC3871f() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // q5.InterfaceC3871f, k8.InterfaceC3199h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // O9.b
            public final Object get() {
                return ((C4121p) c4121pC).a("FIREBASE_ML_SDK", new C3868c("proto"), new InterfaceC3871f() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // q5.InterfaceC3871f, k8.InterfaceC3199h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static AbstractC3869d zzb(zzsb zzsbVar, zzry zzryVar) {
        return new C3866a(zzryVar.zze(zzsbVar.zza(), false), EnumC3870e.f44126b, null);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((C4122q) this.zzb.get()).b(zzb(this.zzc, zzryVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((C4122q) bVar.get()).b(zzb(this.zzc, zzryVar));
        }
    }
}
