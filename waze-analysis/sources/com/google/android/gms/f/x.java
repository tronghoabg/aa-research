package com.google.android.gms.f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.crashlytics.a.c.ah;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements com.google.android.gms.o.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5260a;

    public /* synthetic */ x(int i2) {
        this.f5260a = i2;
    }

    @Override // com.google.android.gms.o.a
    public final Object a(com.google.android.gms.o.t tVar) throws IOException {
        com.google.android.libraries.phenotype.client.a.k kVarBuild;
        boolean z = false;
        switch (this.f5260a) {
            case 0:
                int i2 = aa.f5207a;
                Intent intent = (Intent) ((Bundle) tVar.g()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
            case 1:
                int i3 = aa.f5207a;
                if (tVar.k()) {
                    return (Bundle) tVar.g();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(tVar.f()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", tVar.f());
            case 2:
                com.google.android.gms.l.b bVar = (com.google.android.gms.l.b) tVar.g();
                com.google.android.libraries.phenotype.client.a.g gVarNewBuilder = com.google.android.libraries.phenotype.client.a.h.newBuilder();
                gVarNewBuilder.g(bVar.f5584a);
                gVarNewBuilder.f(bVar.f5586c);
                gVarNewBuilder.e(bVar.f5589f);
                gVarNewBuilder.c(bVar.f5590g);
                byte[] bArr = bVar.f5585b;
                if (bArr != null) {
                    gVarNewBuilder.d(com.google.v.v.q(bArr));
                }
                for (com.google.android.gms.l.a aVar : bVar.f5587d) {
                    for (com.google.android.gms.l.f fVar : aVar.f5581b) {
                        int i4 = fVar.f5619g;
                        if (i4 == 1) {
                            com.google.android.libraries.phenotype.client.a.i iVarNewBuilder = com.google.android.libraries.phenotype.client.a.k.newBuilder();
                            iVarNewBuilder.e(fVar.f5613a);
                            iVarNewBuilder.d(fVar.b());
                            kVarBuild = iVarNewBuilder.build();
                        } else if (i4 == 2) {
                            com.google.android.libraries.phenotype.client.a.i iVarNewBuilder2 = com.google.android.libraries.phenotype.client.a.k.newBuilder();
                            iVarNewBuilder2.e(fVar.f5613a);
                            iVarNewBuilder2.a(fVar.e());
                            kVarBuild = iVarNewBuilder2.build();
                        } else if (i4 == 3) {
                            com.google.android.libraries.phenotype.client.a.i iVarNewBuilder3 = com.google.android.libraries.phenotype.client.a.k.newBuilder();
                            iVarNewBuilder3.e(fVar.f5613a);
                            iVarNewBuilder3.c(fVar.a());
                            kVarBuild = iVarNewBuilder3.build();
                        } else if (i4 == 4) {
                            com.google.android.libraries.phenotype.client.a.i iVarNewBuilder4 = com.google.android.libraries.phenotype.client.a.k.newBuilder();
                            iVarNewBuilder4.e(fVar.f5613a);
                            iVarNewBuilder4.f(fVar.c());
                            kVarBuild = iVarNewBuilder4.build();
                        } else {
                            if (i4 != 5) {
                                throw new IllegalArgumentException("Unrecognized flag type: " + i4);
                            }
                            com.google.android.libraries.phenotype.client.a.i iVarNewBuilder5 = com.google.android.libraries.phenotype.client.a.k.newBuilder();
                            iVarNewBuilder5.e(fVar.f5613a);
                            iVarNewBuilder5.b(com.google.v.v.q(fVar.f()));
                            kVarBuild = iVarNewBuilder5.build();
                        }
                        gVarNewBuilder.b(kVarBuild);
                    }
                    String[] strArr = aVar.f5582c;
                    if (strArr != null) {
                        for (String str : strArr) {
                            gVarNewBuilder.a(str);
                        }
                    }
                }
                return gVarNewBuilder.build();
            case 3:
                if (tVar.k()) {
                    ah ahVar = (ah) tVar.g();
                    com.google.firebase.crashlytics.a.i.a().b("Crashlytics report successfully enqueued to DataTransport: ".concat(ahVar.d()));
                    File fileC = ahVar.c();
                    if (fileC.delete()) {
                        com.google.firebase.crashlytics.a.i.a().b("Deleted report file: ".concat(String.valueOf(fileC.getPath())));
                    } else {
                        com.google.firebase.crashlytics.a.i.a().h("Crashlytics could not delete report file: ".concat(String.valueOf(fileC.getPath())));
                    }
                    z = true;
                } else {
                    com.google.firebase.crashlytics.a.i.a().i("Crashlytics report could not be enqueued to DataTransport", tVar.f());
                }
                return Boolean.valueOf(z);
            case 4:
                Bundle bundle = (Bundle) tVar.h(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 5:
                return ((com.google.firebase.iid.e) tVar.g()).a();
            case 6:
                return -1;
            case 7:
                return 403;
            default:
                Bundle bundle2 = (Bundle) tVar.h(IOException.class);
                if (bundle2 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string4 = bundle2.getString("registration_id");
                if (string4 != null) {
                    return string4;
                }
                String string5 = bundle2.getString("unregistered");
                if (string5 != null) {
                    return string5;
                }
                String string6 = bundle2.getString("error");
                if ("RST".equals(string6)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string6 != null) {
                    throw new IOException(string6);
                }
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
