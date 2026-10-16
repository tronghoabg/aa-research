package m9;

import E5.InterfaceC0451g;
import E5.InterfaceC0453h;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import l8.AbstractC3409K;
import l8.C3407I;
import md.AbstractC3538f;
import md.l0;
import md.m0;
import q5.InterfaceC3873h;
import u6.AbstractC4256a;
import uc.InterfaceC4266c;
import v6.C4303b;
import w9.AbstractC4397p;
import w9.InterfaceC4394m;
import w9.InterfaceC4395n;
import yc.C4592o;

/* loaded from: classes4.dex */
public final /* synthetic */ class B implements InterfaceC4394m, L8.e, Continuation, na.m, Q1.c, InterfaceC4395n, InterfaceC0451g, InterfaceC3873h, OnSuccessListener, InterfaceC4266c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40407a;

    public /* synthetic */ B(int i5) {
        this.f40407a = i5;
    }

    @Override // q5.InterfaceC3873h
    public void a(Exception exc) {
    }

    @Override // Q1.c
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // w9.InterfaceC4394m
    public Object apply(Object obj) {
        H h10 = (H) obj;
        P p10 = h10.f40430e;
        return p10 != null ? p10 instanceof T : h10.f40428c ? new p9.x(h10) : new p9.s(h10);
    }

    @Override // w9.InterfaceC4395n
    public void b(Object obj) {
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        if (!(obj instanceof List)) {
            Fe.b.q("dev.flutter.pigeon.camera_android.CameraGlobalEventApi.deviceOrientationChanged");
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            new C4592o((String) list.get(0), (String) list.get(1), list.get(2));
        }
    }

    @Override // na.m
    public Object d() {
        switch (this.f40407a) {
            case 3:
                return new na.l(true);
            case 4:
                return new TreeSet();
            case 5:
                return new LinkedHashSet();
            case 6:
                return new ArrayDeque();
            case 7:
                return new ArrayList();
            case 8:
                return new ConcurrentSkipListMap();
            case 9:
                return new ConcurrentHashMap();
            case 10:
                return new TreeMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // E5.InterfaceC0451g
    public InterfaceC0453h e(Bundle bundle) {
        l8.e0 e0VarS;
        switch (this.f40407a) {
            case 16:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                bundle2.getClass();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    C3407I c3407i = AbstractC3409K.f40056b;
                    e0VarS = l8.e0.f40101e;
                } else {
                    e0VarS = AbstractC4256a.s(E5.T.f3221H, parcelableArrayList);
                }
                f6.Z z2 = new f6.Z(bundle2.getString(Integer.toString(1, 36), ""), (E5.T[]) e0VarS.toArray(new E5.T[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                intArray.getClass();
                return new r6.p(z2, S3.f.f(intArray));
            default:
                return new C4303b(bundle.getInt(Integer.toString(0, 36), -1), bundle.getByteArray(Integer.toString(3, 36)), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1));
        }
    }

    public Constructor f() {
        switch (this.f40407a) {
            case 17:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(s2.m.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(s2.m.class).getConstructor(new Class[0]);
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        switch (this.f40407a) {
            case 1:
                return FirestoreRegistrar.lambda$getComponents$0(lVar);
            default:
                return AbtRegistrar.lambda$getComponents$0(lVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f40407a) {
            case 26:
                ((AbstractC3538f) obj).b();
                break;
            default:
                ic.d.F("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        switch (this.f40407a) {
            case 2:
                return task.isSuccessful() ? Tasks.forResult(((C8.c) task.getResult()).f1910a) : Tasks.forException(task.getException());
            case 13:
                s9.k kVar = (s9.k) task.getResult();
                if (kVar.d()) {
                    return kVar;
                }
                if (kVar.e()) {
                    return null;
                }
                throw new G("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", F.UNAVAILABLE);
            case 15:
                return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
            default:
                if (task.isSuccessful()) {
                    return (Void) task.getResult();
                }
                Exception exception = task.getException();
                if (exception instanceof l0) {
                    exception = AbstractC4397p.g(((l0) exception).f40690a);
                } else if (exception instanceof m0) {
                    exception = AbstractC4397p.g(((m0) exception).f40698a);
                }
                if (exception instanceof G) {
                    throw exception;
                }
                throw new G(exception.getMessage(), F.UNKNOWN, exception);
        }
    }

    public /* synthetic */ B(a2.k kVar) {
        this.f40407a = 28;
    }
}
