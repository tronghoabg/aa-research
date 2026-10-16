package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rdf implements rze {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rdf(rdj rdjVar, Intent intent, Bundle bundle, int i) {
        this.d = i;
        this.a = rdjVar;
        this.b = intent;
        this.c = bundle;
    }

    @Override // defpackage.rze
    public final void a() throws RemoteException {
        if (this.d != 0) {
            ((rdj) this.b).C().aW((String) this.c, (String) this.a);
        } else {
            qup qupVarC = ((rdj) this.a).C();
            Object obj = this.c;
            Object obj2 = this.b;
            if (!qupVarC.bA((Intent) obj2, (Bundle) obj)) {
                throw new IllegalArgumentException("No matching component for intent: ".concat(String.valueOf(String.valueOf(obj2))));
            }
        }
    }

    public /* synthetic */ rdf(rdj rdjVar, String str, String str2, int i) {
        this.d = i;
        this.b = rdjVar;
        this.c = str;
        this.a = str2;
    }
}
