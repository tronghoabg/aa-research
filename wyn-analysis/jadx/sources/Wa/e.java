package Wa;

import Bf.k;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.AbstractC1451o;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypes;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002'(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "activityBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "delegate", "Lcom/mr/flutter/plugin/filepicker/FilePickerDelegate;", "application", "Landroid/app/Application;", "pluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "observer", "Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;", "activity", "Landroid/app/Activity;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "onMethodCall", "", "call", "Lio/flutter/plugin/common/MethodCall;", "rawResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "setup", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "tearDown", "onAttachedToEngine", "binding", "onDetachedFromEngine", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Companion", "LifeCycleObserver", "file_picker_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC4279p, InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC3965b f15433a;

    /* renamed from: b, reason: collision with root package name */
    public b f15434b;

    /* renamed from: c, reason: collision with root package name */
    public Application f15435c;

    /* renamed from: d, reason: collision with root package name */
    public C3884a f15436d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1451o f15437e;

    /* renamed from: f, reason: collision with root package name */
    public c f15438f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f15439g;

    /* renamed from: h, reason: collision with root package name */
    public C4281r f15440h;

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        this.f15433a = binding;
        C3884a c3884a = this.f15436d;
        if (c3884a != null) {
            InterfaceC4269f interfaceC4269f = c3884a.f44188c;
            AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
            Context context = c3884a.f44186a;
            AbstractC3340k.c(context, "null cannot be cast to non-null type android.app.Application");
            InterfaceC3965b interfaceC3965b = this.f15433a;
            AbstractC3340k.b(interfaceC3965b);
            Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
            AbstractC3340k.d(activity, "getActivity(...)");
            InterfaceC3965b interfaceC3965b2 = this.f15433a;
            AbstractC3340k.b(interfaceC3965b2);
            this.f15439g = activity;
            this.f15435c = (Application) context;
            this.f15434b = new b(activity);
            C4281r c4281r = new C4281r(interfaceC4269f, "miguelruivo.flutter.plugins.filepicker");
            this.f15440h = c4281r;
            c4281r.b(this);
            b bVar = this.f15434b;
            if (bVar != null) {
                new C4273j(interfaceC4269f, "miguelruivo.flutter.plugins.filepickerevent").a(new d(bVar, 0));
                this.f15438f = new c(activity);
                s1 s1Var = (s1) interfaceC3965b2;
                s1Var.b(bVar);
                AbstractC1451o lifecycle = ((HiddenLifecycleReference) s1Var.f43897b).getLifecycle();
                this.f15437e = lifecycle;
                c cVar = this.f15438f;
                if (cVar == null || lifecycle == null) {
                    return;
                }
                lifecycle.a(cVar);
            }
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f15436d = binding;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        InterfaceC3965b interfaceC3965b;
        b bVar = this.f15434b;
        if (bVar != null && (interfaceC3965b = this.f15433a) != null) {
            ((s1) interfaceC3965b).m(bVar);
        }
        this.f15433a = null;
        c cVar = this.f15438f;
        if (cVar != null) {
            AbstractC1451o abstractC1451o = this.f15437e;
            if (abstractC1451o != null) {
                abstractC1451o.c(cVar);
            }
            Application application = this.f15435c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(cVar);
            }
        }
        this.f15437e = null;
        b bVar2 = this.f15434b;
        if (bVar2 != null) {
            bVar2.f15428h = null;
        }
        this.f15434b = null;
        C4281r c4281r = this.f15440h;
        if (c4281r != null) {
            c4281r.b(null);
        }
        this.f15440h = null;
        this.f15435c = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f15436d = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        String strDetect;
        Context applicationContext;
        boolean z2 = false;
        AbstractC3340k.e(call, "call");
        if (this.f15439g == null) {
            ((tc.g) interfaceC4280q).b("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        h hVar = new h((tc.g) interfaceC4280q, 0);
        Object obj = call.f46760b;
        HashMap map = obj instanceof HashMap ? (HashMap) obj : null;
        String str = call.f46759a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1349088399) {
                if (iHashCode != 3522941) {
                    if (iHashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.f15439g;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            try {
                                g.h(new File(applicationContext.getCacheDir().toString() + "/file_picker/"));
                                z2 = true;
                            } catch (Exception e7) {
                                Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e7);
                            }
                            objValueOf = Boolean.valueOf(z2);
                        }
                        hVar.a(objValueOf);
                        return;
                    }
                } else if (str.equals("save")) {
                    Object obj2 = map != null ? map.get("fileType") : null;
                    AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    String strC = g.c((String) obj2);
                    String str2 = (String) (map != null ? map.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (map != null ? map.get("bytes") : null);
                    String strValueOf = String.valueOf(map != null ? map.get("fileName") : null);
                    if (strValueOf.length() > 0 && !k.n0(strValueOf, ".", false)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strValueOf);
                        sb2.append('.');
                        String strDetect2 = new Tika().detect(bArr);
                        AbstractC3340k.b(strDetect2);
                        sb2.append(k.M0(strDetect2, "/", strDetect2));
                        strValueOf = sb2.toString();
                    }
                    b bVar = this.f15434b;
                    if (bVar != null) {
                        if (bVar.f15422b != null) {
                            int i5 = b.f15420j;
                            hVar.b("already_active", "File picker is already active", null);
                            return;
                        }
                        bVar.f15422b = hVar;
                        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        if (strValueOf != null && strValueOf.length() != 0) {
                            intent.putExtra("android.intent.extra.TITLE", strValueOf);
                        }
                        bVar.f15429i = bArr;
                        if (!"dir".equals(strC)) {
                            try {
                                Tika tika = new Tika();
                                if (strValueOf == null || strValueOf.length() == 0) {
                                    strDetect = tika.detect(bArr);
                                } else {
                                    Detector detector = tika.getDetector();
                                    TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
                                    org.apache.tika.metadata.Metadata metadata = new org.apache.tika.metadata.Metadata();
                                    metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, strValueOf);
                                    strDetect = detector.detect(tikaInputStream, metadata).toString();
                                }
                                if (AbstractC3340k.a(strDetect, MimeTypes.PLAIN_TEXT)) {
                                    strDetect = "*/*";
                                } else {
                                    AbstractC3340k.b(strDetect);
                                }
                                intent.setType(strDetect);
                            } catch (Throwable th) {
                                intent.setType("*/*");
                                Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
                            }
                        }
                        if (str2 != null && str2.length() != 0 && Build.VERSION.SDK_INT >= 26) {
                            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str2));
                        }
                        Activity activity2 = bVar.f15421a;
                        if (intent.resolveActivity(activity2.getPackageManager()) != null) {
                            activity2.startActivityForResult(intent, b.k);
                            return;
                        } else {
                            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                            bVar.b("invalid_format_type", "Can't handle the provided file type.");
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                ArrayList arrayListG = g.g((ArrayList) (map != null ? map.get("allowedExtensions") : null));
                b bVar2 = this.f15434b;
                if (bVar2 != null) {
                    g.i(bVar2, g.c(str), (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), arrayListG, (Integer) (map != null ? map.get("compressionQuality") : null), hVar);
                    return;
                }
                return;
            }
        }
        AbstractC3340k.b(str);
        String strC2 = g.c(str);
        if (strC2 == null) {
            hVar.c();
            return;
        }
        b bVar3 = this.f15434b;
        if (bVar3 != null) {
            g.i(bVar3, strC2, (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), g.g((ArrayList) (map != null ? map.get("allowedExtensions") : null)), (Integer) (map != null ? map.get("compressionQuality") : null), hVar);
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
