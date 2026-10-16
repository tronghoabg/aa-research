package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0629d;
import J8.u;
import K8.InterfaceC0702n;
import a.AbstractC1304a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes.dex */
final class zzaea implements zzadf {
    final /* synthetic */ zzady zza;

    public zzaea(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status) throws RemoteException {
        String str = status.f26430b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzady zzadyVar = this.zza;
        if (zzadyVar.zza == 8) {
            zzadyVar.zzu = true;
            zza(new zzaee(this, status));
        } else {
            zzady.zza(zzadyVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb(String str) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 8);
        zza(new zzadz(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc(String str) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 7);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb() throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 6);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc() throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 9);
        zzady.zza(this.zza);
    }

    private final void zza(zzaeg zzaegVar) {
        this.zza.zzi.execute(new zzaed(this, zzaegVar));
    }

    private final void zza(Status status, AbstractC0629d abstractC0629d, String str, String str2) {
        zzady.zza(this.zza, status);
        zzady zzadyVar = this.zza;
        zzadyVar.zzn = abstractC0629d;
        zzadyVar.zzo = str;
        zzadyVar.zzp = str2;
        InterfaceC0702n interfaceC0702n = zzadyVar.zzf;
        if (interfaceC0702n != null) {
            interfaceC0702n.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(String str) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 8);
        this.zza.zzu = true;
        zza(new zzaeb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzafl zzaflVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 3);
        zzady zzadyVar = this.zza;
        zzadyVar.zzl = zzaflVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza() throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 5);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzi zzziVar) {
        zza(zzziVar.zza(), zzziVar.zzb(), zzziVar.zzc(), zzziVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzl zzzlVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzq = zzzlVar;
        zzadyVar.zza(AbstractC1304a.i0("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status, u uVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 2);
        zza(status, uVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagh zzaghVar) throws RemoteException {
        zzady zzadyVar = this.zza;
        zzadyVar.zzs = zzaghVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagm zzagmVar) throws RemoteException {
        zzady zzadyVar = this.zza;
        zzadyVar.zzr = zzagmVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar, zzage zzageVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type: " + i5, i5 == 2);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzadyVar.zzk = zzageVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagv zzagvVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 4);
        zzady zzadyVar = this.zza;
        zzadyVar.zzm = zzagvVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzaha zzahaVar) throws RemoteException {
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzahh zzahhVar) throws RemoteException {
        zzady zzadyVar = this.zza;
        zzadyVar.zzt = zzahhVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type: " + i5, i5 == 1);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(u uVar) throws RemoteException {
        int i5 = this.zza.zza;
        AbstractC1732v.k("Unexpected response type " + i5, i5 == 8);
        this.zza.zzu = true;
        zza(new zzaec(this, uVar));
    }
}
