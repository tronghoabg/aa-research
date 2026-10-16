package mc;

import U8.v0;
import a2.C1323c;
import ad.L;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.animation.BaseInterpolator;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.X;
import ld.AbstractC3459a;
import o.C3629j;
import uc.C4276m;
import uc.InterfaceC4267d;
import uc.InterfaceC4268e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class b implements InterfaceC4269f {

    /* renamed from: a, reason: collision with root package name */
    public long f40522a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40523b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40524c;

    /* renamed from: d, reason: collision with root package name */
    public Object f40525d;

    /* renamed from: e, reason: collision with root package name */
    public Object f40526e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f40527f;

    public b() {
        this.f40522a = -1L;
        this.f40527f = new C3629j(this);
        this.f40524c = new ArrayList();
    }

    public void a() {
        if (this.f40523b) {
            Iterator it = ((ArrayList) this.f40524c).iterator();
            while (it.hasNext()) {
                ((X) it.next()).b();
            }
            this.f40523b = false;
        }
    }

    @Override // uc.InterfaceC4269f
    public ab.b b() {
        return ((j) ((C1323c) this.f40527f).f17156b).c(new C4276m());
    }

    public void c(G9.e eVar) {
        if (this.f40523b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC3459a.b("DartExecutor#executeDartCallback");
        try {
            Objects.toString(eVar);
            FlutterJNI flutterJNI = (FlutterJNI) this.f40524c;
            String str = (String) eVar.f4686c;
            FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) eVar.f4687d;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, (AssetManager) eVar.f4685b, null, this.f40522a);
            this.f40523b = true;
            Trace.endSection();
        } finally {
        }
    }

    public void d(a aVar, List list) {
        if (this.f40523b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC3459a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            ((FlutterJNI) this.f40524c).runBundleAndSnapshotFromLibrary(aVar.f40519a, aVar.f40521c, aVar.f40520b, (AssetManager) this.f40525d, list, this.f40522a);
            this.f40523b = true;
            Trace.endSection();
        } finally {
        }
    }

    public void e() {
        View view;
        if (this.f40523b) {
            return;
        }
        Iterator it = ((ArrayList) this.f40524c).iterator();
        while (it.hasNext()) {
            X x5 = (X) it.next();
            long j8 = this.f40522a;
            if (j8 >= 0) {
                x5.c(j8);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.f40525d;
            if (baseInterpolator != null && (view = (View) x5.f38790a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((v0) this.f40526e) != null) {
                x5.d((C3629j) this.f40527f);
            }
            View view2 = (View) x5.f38790a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f40523b = true;
    }

    @Override // uc.InterfaceC4269f
    public void i(String str, InterfaceC4267d interfaceC4267d, ab.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((C1323c) this.f40527f).i(str, interfaceC4267d, bVar);
    }

    @Override // uc.InterfaceC4269f
    public void j(String str, ByteBuffer byteBuffer, InterfaceC4268e interfaceC4268e) {
        ((C1323c) this.f40527f).j(str, byteBuffer, interfaceC4268e);
    }

    @Override // uc.InterfaceC4269f
    public void l(String str, InterfaceC4267d interfaceC4267d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((C1323c) this.f40527f).l(str, interfaceC4267d);
    }

    @Override // uc.InterfaceC4269f
    public void q(String str, ByteBuffer byteBuffer) {
        ((C1323c) this.f40527f).q(str, byteBuffer);
    }

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f40523b = false;
        L l10 = new L(this, 15);
        this.f40524c = flutterJNI;
        this.f40525d = assetManager;
        this.f40522a = j8;
        j jVar = new j(flutterJNI);
        this.f40526e = jVar;
        jVar.i("flutter/isolate", l10, null);
        this.f40527f = new C1323c(jVar, 18);
        if (flutterJNI.isAttached()) {
            this.f40523b = true;
        }
    }
}
