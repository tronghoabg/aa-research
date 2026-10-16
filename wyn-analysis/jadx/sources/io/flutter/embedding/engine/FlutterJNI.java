package io.flutter.embedding.engine;

import A7.AbstractC0279p0;
import A7.S;
import E5.Q;
import Y2.B;
import ad.C1355I;
import ae.b;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import e0.AbstractC2449a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.C2867c;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.a;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kc.m;
import kc.r;
import lc.InterfaceC3457a;
import lc.h;
import lc.i;
import mc.d;
import mc.j;
import mc.k;
import md.J;
import n5.C3594a;
import nc.InterfaceC3614a;
import pc.C3791a;
import uc.C4286w;
import uc.InterfaceC4268e;
import vc.C4337a;

@Keep
/* loaded from: classes5.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static i asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private h accessibilityDelegate;
    private InterfaceC3614a deferredComponentManager;
    private C4337a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private q platformViewsController;
    private p platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC3457a> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<l> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j8) {
        i iVar = asyncWaitForVsyncDelegate;
        if (iVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        a aVar = (a) iVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        S s10 = (S) aVar.f37189a;
        t tVar = (t) s10.f692d;
        if (tVar != null) {
            tVar.f37314a = j8;
            s10.f692d = null;
        } else {
            tVar = new t(s10, j8);
        }
        choreographer.postFrameCallback(tVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lc.g] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j8) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: lc.g
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    FlutterJNI.lambda$decodeImage$0(j8, imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e7) {
            Log.e(TAG, "Failed to decode image", e7);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i5, ByteBuffer byteBuffer) {
        InterfaceC4268e interfaceC4268e;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (interfaceC4268e = (InterfaceC4268e) ((j) kVar).f40552f.remove(Integer.valueOf(i5))) == null) {
            return;
        }
        try {
            interfaceC4268e.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e7) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e7;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e7);
        } catch (Exception e10) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j8, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j8, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j8);

    private native void nativeDeferredComponentInstallFailure(int i5, String str, boolean z2);

    private native void nativeDestroy(long j8);

    private native void nativeDispatchEmptyPlatformMessage(long j8, String str, int i5);

    private native void nativeDispatchPlatformMessage(long j8, String str, ByteBuffer byteBuffer, int i5, int i10);

    private native void nativeDispatchPointerDataPacket(long j8, ByteBuffer byteBuffer, int i5);

    private native void nativeDispatchSemanticsAction(long j8, int i5, int i10, ByteBuffer byteBuffer, int i11);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i5);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i5);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i5);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i5);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i5);

    private native Bitmap nativeGetBitmap(long j8);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j8, int i5, int i10);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j8, int i5);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j8, int i5);

    private native void nativeInvokePlatformMessageResponseCallback(long j8, int i5, ByteBuffer byteBuffer, int i10);

    private native boolean nativeIsSurfaceControlEnabled(long j8);

    private native void nativeLoadDartDeferredLibrary(long j8, int i5, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j8);

    private native void nativeMarkTextureFrameAvailable(long j8, long j10);

    private native void nativeNotifyLowMemoryWarning(long j8);

    private native void nativeOnVsync(long j8, long j10, long j11);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j8, long j10, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j8, long j10, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j8, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j10);

    private native void nativeScheduleFrame(long j8);

    private native void nativeSetAccessibilityFeatures(long j8, int i5);

    private native void nativeSetSemanticsEnabled(long j8, boolean z2);

    private native void nativeSetViewportMetrics(long j8, float f10, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j8, String str, String str2, String str3, List<String> list, long j10);

    private native void nativeSurfaceChanged(long j8, int i5, int i10);

    private native void nativeSurfaceCreated(long j8, Surface surface);

    private native void nativeSurfaceDestroyed(long j8);

    private native void nativeSurfaceWindowChanged(long j8, Surface surface);

    private native void nativeUnregisterTexture(long j8, long j10);

    private native void nativeUpdateDisplayMetrics(long j8);

    private native void nativeUpdateJavaAssetManager(long j8, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        Iterator<InterfaceC3457a> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        h hVar = this.accessibilityDelegate;
        if (hVar != null) {
            a aVar = (a) hVar;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.l lVar = (io.flutter.view.l) aVar.f37189a;
            lVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f fVarB = lVar.b(byteBuffer.getInt());
                fVarB.f37220c = byteBuffer.getInt();
                int i5 = byteBuffer.getInt();
                String str = null;
                fVarB.f37221d = i5 == -1 ? null : strArr[i5];
                int i10 = byteBuffer.getInt();
                if (i10 != -1) {
                    str = strArr[i10];
                }
                fVarB.f37222e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        h hVar = this.accessibilityDelegate;
        if (hVar != null) {
            ((a) hVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC3457a interfaceC3457a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC3457a);
    }

    public void addIsDisplayingFlutterUiListener(l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(lVar);
    }

    public void applyTransactions() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionH = AbstractC2449a.h();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = pVar.f37127l;
            if (i5 >= arrayList.size()) {
                transactionH.apply();
                arrayList.clear();
                return;
            } else {
                transactionH = transactionH.merge(AbstractC2449a.j(arrayList.get(i5)));
                i5++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j8) {
        nativeCleanupMessageData(j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        if (r4.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0146, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        if (r4.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0165, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        C2867c c2867c = new C2867c(qVar.f37136d.getContext(), qVar.f37136d.getWidth(), qVar.f37136d.getHeight(), 2);
        c2867c.f37092g = qVar.f37140h;
        int i5 = qVar.f37146o;
        qVar.f37146o = i5 + 1;
        qVar.f37144m.put(i5, c2867c);
        return new FlutterOverlaySurface(i5, c2867c.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (pVar.f37129n == null) {
            SurfaceControl.Builder builderG = AbstractC2449a.g();
            builderG.setBufferSize(pVar.f37120d.getWidth(), pVar.f37120d.getHeight());
            builderG.setFormat(1);
            builderG.setName("Flutter Overlay Surface");
            builderG.setOpaque(false);
            builderG.setHidden(false);
            SurfaceControl surfaceControlBuild = builderG.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = pVar.f37120d.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            pVar.f37129n = AbstractC2449a.f(surfaceControlBuild);
            pVar.f37130o = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, pVar.f37129n);
    }

    public SurfaceControl.Transaction createTransaction() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionH = AbstractC2449a.h();
        pVar.f37127l.add(transactionH);
        return transactionH;
    }

    public void deferredComponentInstallFailure(int i5, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i5, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = pVar.f37129n;
        if (surface != null) {
            surface.release();
            pVar.f37129n = null;
            pVar.f37130o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        qVar.g();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i5);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i5, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i5, i10);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i10);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i5, e eVar) {
        dispatchSemanticsAction(i5, eVar, null);
    }

    public void endFrame2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionH = AbstractC2449a.h();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = pVar.f37128m;
            if (i5 >= arrayList.size()) {
                arrayList.clear();
                pVar.f37120d.invalidate();
                pVar.f37120d.getRootSurfaceControl().applyTransactionOnDraw(transactionH);
                return;
            }
            transactionH = transactionH.merge(AbstractC2449a.j(arrayList.get(i5)));
            i5++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            md.J r0 = tc.i.f46013b
            java.lang.Object r1 = r0.f40581b
            tc.h r1 = (tc.h) r1
            java.lang.Object r2 = r0.f40580a
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            tc.h r1 = (tc.h) r1
            r0.f40581b = r1
        L14:
            java.lang.Object r1 = r0.f40581b
            tc.h r1 = (tc.h) r1
            if (r1 == 0) goto L27
            int r3 = r1.f46011a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            tc.h r1 = (tc.h) r1
            r0.f40581b = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f46011a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f40581b
            tc.h r0 = (tc.h) r0
            int r0 = r0.f46011a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f46012b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i5, long j8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mc.f fVar;
        boolean z2;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j8);
            return;
        }
        j jVar = (j) kVar;
        synchronized (jVar.f40550d) {
            try {
                fVar = (mc.f) jVar.f40548b.get(str);
                z2 = jVar.f40551e.get() && fVar == null;
                if (z2) {
                    if (!jVar.f40549c.containsKey(str)) {
                        jVar.f40549c.put(str, new LinkedList());
                    }
                    ((List) jVar.f40549c.get(str)).add(new d(j8, i5, byteBuffer));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i5, j8);
    }

    public void hideOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (pVar.f37130o == null) {
            return;
        }
        SurfaceControl.Transaction transactionH = AbstractC2449a.h();
        transactionH.setVisibility(pVar.f37130o, false);
        transactionH.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j8, int i5) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j8, i5);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i5) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i5);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i5);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i5, ByteBuffer byteBuffer, int i10) throws Throwable {
        FlutterJNI flutterJNIIsAttached;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNIIsAttached = isAttached();
            try {
                if (flutterJNIIsAttached != 0) {
                    FlutterJNI flutterJNI = this;
                    flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i5, byteBuffer, i10);
                    flutterJNIIsAttached = flutterJNI;
                } else {
                    flutterJNIIsAttached = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i5);
                }
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNIIsAttached = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i5) {
        return nativeFlutterTextUtilsIsEmoji(i5);
    }

    public boolean isCodePointEmojiModifier(int i5) {
        return nativeFlutterTextUtilsIsEmojiModifier(i5);
    }

    public boolean isCodePointEmojiModifierBase(int i5) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i5);
    }

    public boolean isCodePointRegionalIndicator(int i5) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i5);
    }

    public boolean isCodePointVariantSelector(int i5) {
        return nativeFlutterTextUtilsIsVariationSelector(i5);
    }

    public void loadDartDeferredLibrary(int i5, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i5, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [Y2.B] */
    public void loadLibrary(Context context) throws Throwable {
        InputStream inputStream;
        ?? r92;
        String[] strArrK;
        ZipFile zipFile;
        InputStream inputStream2;
        InputStream inputStream3;
        ?? fileOutputStream;
        char c10 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        J j8 = new J(1);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        J.r("Beginning load of %s...", "flutter");
        b bVar = (b) j8.f40581b;
        HashSet hashSet = (HashSet) j8.f40580a;
        if (hashSet.contains("flutter")) {
            J.r("%s already loaded previously!", "flutter");
        } else {
            InputStream inputStream4 = null;
            try {
                bVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                J.r("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e7) {
                J.r("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                J.r("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileQ = j8.q(context);
                if (fileQ.exists()) {
                    inputStream = null;
                } else {
                    File dir = context.getDir("lib", 0);
                    File fileQ2 = j8.q(context);
                    bVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C3594a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        int i5 = 0;
                        while (i5 < length) {
                            File file = fileArrListFiles[i5];
                            InputStream inputStream5 = inputStream4;
                            if (!file.getAbsolutePath().equals(fileQ2.getAbsolutePath())) {
                                file.delete();
                            }
                            i5++;
                            inputStream4 = inputStream5;
                        }
                    }
                    inputStream = inputStream4;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((C1355I) j8.f40582c).getClass();
                    try {
                        B bJ = C1355I.j(context, strArr, strMapLibraryName, j8);
                        try {
                            if (bJ == null) {
                                try {
                                    strArrK = C1355I.k(context, strMapLibraryName);
                                } catch (Exception e10) {
                                    strArrK = new String[]{e10.toString()};
                                }
                                throw new Q(strMapLibraryName, strArr, strArrK);
                            }
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                zipFile = (ZipFile) bJ.f16383b;
                                if (i10 < 5) {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = strMapLibraryName;
                                    J.r("Found %s! Extracting...", objArr);
                                    try {
                                        if (fileQ.exists() || fileQ.createNewFile()) {
                                            try {
                                                inputStream3 = zipFile.getInputStream((ZipEntry) bJ.f16384c);
                                                try {
                                                    fileOutputStream = new FileOutputStream(fileQ);
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        long j10 = 0;
                                                        while (true) {
                                                            int i12 = inputStream3.read(bArr);
                                                            if (i12 == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(bArr, 0, i12);
                                                            j10 += i12;
                                                        }
                                                        fileOutputStream.flush();
                                                        fileOutputStream.getFD().sync();
                                                        if (j10 == fileQ.length()) {
                                                            C1355I.i(inputStream3);
                                                            C1355I.i(fileOutputStream);
                                                            fileQ.setReadable(true, false);
                                                            fileQ.setExecutable(true, false);
                                                            fileQ.setWritable(true);
                                                            break;
                                                        }
                                                        C1355I.i(inputStream3);
                                                        C1355I.i(fileOutputStream);
                                                    } catch (FileNotFoundException unused) {
                                                        C1355I.i(inputStream3);
                                                        C1355I.i(fileOutputStream);
                                                        i10 = i11;
                                                        c10 = 0;
                                                    } catch (IOException unused2) {
                                                        C1355I.i(inputStream3);
                                                        C1355I.i(fileOutputStream);
                                                        i10 = i11;
                                                        c10 = 0;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        inputStream2 = inputStream3;
                                                        inputStream = fileOutputStream;
                                                        C1355I.i(inputStream2);
                                                        C1355I.i(inputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException unused3) {
                                                    fileOutputStream = inputStream;
                                                } catch (IOException unused4) {
                                                    fileOutputStream = inputStream;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream2 = inputStream3;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                inputStream3 = inputStream;
                                                fileOutputStream = inputStream3;
                                            } catch (IOException unused6) {
                                                inputStream3 = inputStream;
                                                fileOutputStream = inputStream3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream2 = inputStream;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i10 = i11;
                                    c10 = 0;
                                }
                            }
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r92 = bJ;
                            if (r92 != 0) {
                                try {
                                    ((ZipFile) r92.f16383b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r92 = inputStream;
                    }
                }
                String absolutePath = fileQ.getAbsolutePath();
                bVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                J.r("%s (%s) was re-linked!", "flutter", inputStream);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j8);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        qVar.f37149r.clear();
        qVar.f37150s.clear();
    }

    public void onDisplayOverlaySurface(int i5, int i10, int i11, int i12, int i13) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = qVar.f37144m;
        if (sparseArray.get(i5) == null) {
            throw new IllegalStateException(AbstractC0279p0.i(i5, "The overlay surface (id:", ") doesn't exist"));
        }
        qVar.k();
        View view = (C2867c) sparseArray.get(i5);
        if (view.getParent() == null) {
            qVar.f37136d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        qVar.f37149r.add(Integer.valueOf(i5));
    }

    public void onDisplayPlatformView(int i5, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        qVar.k();
        SparseArray sparseArray = qVar.k;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) sparseArray.get(i5);
        if (eVar == null) {
            return;
        }
        SparseArray sparseArray2 = qVar.f37143l;
        if (sparseArray2.get(i5) == null) {
            View view = eVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = qVar.f37135c;
            C3791a c3791a = new C3791a(activity, activity.getResources().getDisplayMetrics().density, qVar.f37134b);
            c3791a.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.k(qVar, i5, 0));
            sparseArray2.put(i5, c3791a);
            view.setImportantForAccessibility(4);
            c3791a.addView(view);
            qVar.f37136d.addView(c3791a);
        }
        C3791a c3791a2 = (C3791a) sparseArray2.get(i5);
        c3791a2.f43454a = flutterMutatorsStack;
        c3791a2.f43456c = i10;
        c3791a2.f43457d = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        c3791a2.setLayoutParams(layoutParams);
        c3791a2.setWillNotDraw(false);
        c3791a2.setVisibility(0);
        c3791a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i15);
        View view2 = ((io.flutter.plugin.platform.e) sparseArray.get(i5)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        qVar.f37150s.add(Integer.valueOf(i5));
    }

    public void onDisplayPlatformView2(int i5, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        SparseArray sparseArray = pVar.f37125i;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) sparseArray.get(i5);
        if (eVar == null) {
            return;
        }
        SparseArray sparseArray2 = pVar.f37126j;
        if (sparseArray2.get(i5) == null) {
            View view = eVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = pVar.f37119c;
            C3791a c3791a = new C3791a(activity, activity.getResources().getDisplayMetrics().density, pVar.f37118b);
            c3791a.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.k(pVar, i5, 1));
            sparseArray2.put(i5, c3791a);
            view.setImportantForAccessibility(4);
            c3791a.addView(view);
            pVar.f37120d.addView(c3791a);
        }
        C3791a c3791a2 = (C3791a) sparseArray2.get(i5);
        c3791a2.f43454a = flutterMutatorsStack;
        c3791a2.f43456c = i10;
        c3791a2.f43457d = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        c3791a2.setLayoutParams(layoutParams);
        c3791a2.setWillNotDraw(false);
        c3791a2.setVisibility(0);
        c3791a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i15);
        View view2 = ((io.flutter.plugin.platform.e) sparseArray.get(i5)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() throws IOException {
        ?? r32;
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!qVar.f37147p || !qVar.f37150s.isEmpty()) {
            if (qVar.f37147p) {
                m mVar = qVar.f37136d.f39516c;
                if (mVar != null ? mVar.c() : false) {
                    z2 = true;
                }
            }
            qVar.i(z2);
            return;
        }
        qVar.f37147p = false;
        r rVar = qVar.f37136d;
        com.applovin.adview.a aVar = new com.applovin.adview.a(qVar, 28);
        m mVar2 = rVar.f39516c;
        if (mVar2 == null || (r32 = rVar.f39518e) == 0) {
            return;
        }
        rVar.f39517d = r32;
        rVar.f39518e = null;
        io.flutter.embedding.engine.renderer.k kVar = rVar.f39521h.f40252b;
        if (kVar != null) {
            r32.resume();
            kc.q qVar2 = new kc.q(rVar, kVar, aVar);
            kVar.f37008a.addIsDisplayingFlutterUiListener(qVar2);
            if (kVar.f37011d) {
                qVar2.e();
                return;
            }
            return;
        }
        mVar2.b();
        m mVar3 = rVar.f39516c;
        if (mVar3 != null) {
            mVar3.f39496a.close();
            rVar.removeView(rVar.f39516c);
            rVar.f39516c = null;
        }
        aVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<l> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<l> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void onSurfaceChanged(int i5, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i5, i10);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j8, long j10, long j11) {
        nativeOnVsync(j8, j10, j11);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j8, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j8, new WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j8, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j8, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(InterfaceC3457a interfaceC3457a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC3457a);
    }

    public void removeIsDisplayingFlutterUiListener(l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i5) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j8);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(h hVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = hVar;
    }

    public void setAccessibilityFeatures(int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i5);
        }
    }

    public void setAccessibilityFeaturesInNative(int i5) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i5);
    }

    public void setAsyncWaitForVsyncDelegate(i iVar) {
        asyncWaitForVsyncDelegate = iVar;
    }

    public void setDeferredComponentManager(InterfaceC3614a interfaceC3614a) {
        ensureRunningOnMainThread();
        if (interfaceC3614a != null) {
            interfaceC3614a.a();
        }
    }

    public void setLocalizationPlugin(C4337a c4337a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c4337a;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(q qVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = qVar;
    }

    public void setPlatformViewsController2(p pVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = pVar;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f10, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i5, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (pVar.f37130o == null) {
            return;
        }
        SurfaceControl.Transaction transactionH = AbstractC2449a.h();
        transactionH.setVisibility(pVar.f37130o, true);
        transactionH.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j8);
        Long l10 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l10 == null || l10.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        synchronized (pVar) {
            try {
                pVar.f37128m.clear();
                for (int i5 = 0; i5 < pVar.f37127l.size(); i5++) {
                    pVar.f37128m.add(AbstractC2449a.j(pVar.f37127l.get(i5)));
                }
                pVar.f37127l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j8);
    }

    public void updateDisplayMetrics(int i5, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i5, e eVar, Object obj) {
        ByteBuffer byteBufferA;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferA = C4286w.f46765a.a(obj);
            iPosition = byteBufferA.position();
        } else {
            byteBufferA = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i5, eVar.f37217a, byteBufferA, iPosition);
    }

    public void dispatchSemanticsAction(int i5, int i10, ByteBuffer byteBuffer, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i5, i10, byteBuffer, i11);
    }
}
