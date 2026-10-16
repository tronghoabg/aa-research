package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import A0.p;
import Ba.c;
import Bf.k;
import C8.i;
import E5.Q;
import Ef.E;
import Ef.H;
import Ge.d;
import Ge.e;
import Ge.f;
import Ge.h;
import W9.u;
import X2.j;
import Yd.a;
import a2.C1323c;
import a9.C1341a;
import ac.C1346a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import de.C2431a;
import ef.C2514B;
import ef.C2527k;
import ff.AbstractC2641B;
import ff.w;
import io.qonversion.nocodes.internal.screen.view.ScreenActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import k3.C3184p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import la.l;
import me.C3558a;
import ne.C3618a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import re.C3977a;
import re.C3979c;
import re.C3980d;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010\u001c\u001a\u00020\u00142\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;", "Lio/qonversion/sandwich/NoCodesEventListener;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "context", "Landroid/content/Context;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V", "noCodesSandwich", "Lio/qonversion/sandwich/NoCodesSandwich;", "gson", "Lcom/google/gson/Gson;", "screenShownEventStreamHandler", "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;", "finishedEventStreamHandler", "actionStartedEventStreamHandler", "actionFailedEventStreamHandler", "actionFinishedEventStreamHandler", "screenFailedToLoadEventStreamHandler", "setup", "", "initializeNoCodes", "args", "", "", "", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "setScreenPresentationConfig", "config", "contextKey", "showNoCodesScreen", "closeNoCodes", "onNoCodesEvent", "event", "Lio/qonversion/sandwich/NoCodesEventListener$Event;", "payload", "Lio/qonversion/sandwich/BridgeData;", "Companion", "qonversion_flutter_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoCodesPlugin implements e {

    @NotNull
    private static final String ACTION_FAILED_EVENT_CHANNEL = "nocodes_action_failed";

    @NotNull
    private static final String ACTION_FINISHED_EVENT_CHANNEL = "nocodes_action_finished";

    @NotNull
    private static final String ACTION_STARTED_EVENT_CHANNEL = "nocodes_action_started";

    @NotNull
    private static final String FINISHED_EVENT_CHANNEL = "nocodes_finished";

    @NotNull
    private static final String SCREEN_FAILED_TO_LOAD_EVENT_CHANNEL = "nocodes_screen_failed_to_load";

    @NotNull
    private static final String SCREEN_SHOWN_EVENT_CHANNEL = "nocodes_screen_shown";

    @Nullable
    private BaseEventStreamHandler actionFailedEventStreamHandler;

    @Nullable
    private BaseEventStreamHandler actionFinishedEventStreamHandler;

    @Nullable
    private BaseEventStreamHandler actionStartedEventStreamHandler;

    @NotNull
    private final Context context;

    @Nullable
    private BaseEventStreamHandler finishedEventStreamHandler;

    @NotNull
    private final l gson;

    @NotNull
    private final InterfaceC4269f messenger;

    @Nullable
    private h noCodesSandwich;

    @Nullable
    private BaseEventStreamHandler screenFailedToLoadEventStreamHandler;

    @Nullable
    private BaseEventStreamHandler screenShownEventStreamHandler;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                d dVar = d.f4738a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d dVar2 = d.f4738a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d dVar3 = d.f4738a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d dVar4 = d.f4738a;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d dVar5 = d.f4738a;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d dVar6 = d.f4738a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NoCodesPlugin(@NotNull InterfaceC4269f messenger, @NotNull Context context) {
        AbstractC3340k.e(messenger, "messenger");
        AbstractC3340k.e(context, "context");
        this.messenger = messenger;
        this.context = context;
        this.gson = new l();
        setup();
    }

    private final void setup() {
        BaseListenerWrapper baseListenerWrapper = new BaseListenerWrapper(this.messenger, SCREEN_SHOWN_EVENT_CHANNEL);
        baseListenerWrapper.register();
        this.screenShownEventStreamHandler = baseListenerWrapper.getEventStreamHandler();
        BaseListenerWrapper baseListenerWrapper2 = new BaseListenerWrapper(this.messenger, FINISHED_EVENT_CHANNEL);
        baseListenerWrapper2.register();
        this.finishedEventStreamHandler = baseListenerWrapper2.getEventStreamHandler();
        BaseListenerWrapper baseListenerWrapper3 = new BaseListenerWrapper(this.messenger, ACTION_STARTED_EVENT_CHANNEL);
        baseListenerWrapper3.register();
        this.actionStartedEventStreamHandler = baseListenerWrapper3.getEventStreamHandler();
        BaseListenerWrapper baseListenerWrapper4 = new BaseListenerWrapper(this.messenger, ACTION_FAILED_EVENT_CHANNEL);
        baseListenerWrapper4.register();
        this.actionFailedEventStreamHandler = baseListenerWrapper4.getEventStreamHandler();
        BaseListenerWrapper baseListenerWrapper5 = new BaseListenerWrapper(this.messenger, ACTION_FINISHED_EVENT_CHANNEL);
        baseListenerWrapper5.register();
        this.actionFinishedEventStreamHandler = baseListenerWrapper5.getEventStreamHandler();
        BaseListenerWrapper baseListenerWrapper6 = new BaseListenerWrapper(this.messenger, SCREEN_FAILED_TO_LOAD_EVENT_CHANNEL);
        baseListenerWrapper6.register();
        this.screenFailedToLoadEventStreamHandler = baseListenerWrapper6.getEventStreamHandler();
    }

    public final void closeNoCodes(@NotNull InterfaceC4280q result) {
        AbstractC3340k.e(result, "result");
        if (this.noCodesSandwich != null) {
            G9.e eVar = a.f16790a;
            if (eVar == null) {
                throw new C2514B("Qonversion No-Codes has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion No-Codes.");
            }
            Ce.a aVar = (Ce.a) eVar.f4687d;
            WeakReference weakReference = ((De.a) aVar.f2198c).f2658a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            boolean z2 = activity instanceof ScreenActivity;
            C1346a c1346a = (C1346a) aVar.f421a;
            if (z2) {
                c1346a.O("close() -> Closing the current screen activity");
                ((ScreenActivity) activity).finish();
            } else {
                c.U(c1346a, "close() -> There is no visible No-Code Screen activity found to close");
            }
        }
        result.a(null);
    }

    public final void initializeNoCodes(@NotNull Map<String, ? extends Object> args, @NotNull InterfaceC4280q result) {
        AbstractC3340k.e(args, "args");
        AbstractC3340k.e(result, "result");
        Object obj = args.get("projectKey");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        Object obj2 = args.get("version");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        Object obj3 = args.get("source");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        if (str.length() <= 0) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        this.noCodesSandwich = new h();
        Context context = this.context;
        AbstractC3340k.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("io.qonversion.nocodes", 0);
        AbstractC3340k.d(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("sourceVersion", str2);
        editorEdit.putString("source", str3);
        editorEdit.apply();
        if (this.noCodesSandwich != null) {
            Context context2 = this.context;
            AbstractC3340k.e(context2, "context");
            ae.a aVar = ae.a.f17623b;
            if (k.y0(str)) {
                throw new IllegalStateException("Project key is empty");
            }
            C3980d c3980d = new C3980d(str);
            C3184p c3184p = new C3184p(null);
            C3977a c3977a = new C3977a(aVar, "Qonversion No-Codes");
            Context applicationContext = context2.getApplicationContext();
            AbstractC3340k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) applicationContext;
            b7.k kVar = new b7.k(application, c3980d, c3184p, c3977a);
            if (a.f16790a != null) {
                Log.e("Qonversion No-Codes", "Qonversion No-Codes has been initialized already. Multiple instances of Qonversion No-Codes are not supported now.");
            } else {
                i iVar = new i(kVar);
                C3558a c3558a = new C3558a();
                c3558a.f40736a = application;
                c3558a.f40737b = iVar;
                c3558a.f40738c = Fe.c.z(new p(c3558a, 25));
                C1341a c1341a = new C1341a();
                C1323c c1323c = new C1323c(application, 23);
                C3618a c3618a = new C3618a();
                c3618a.f41020a = iVar;
                c3618a.f41021b = c1323c;
                c3618a.f41022c = c3558a;
                j jVar = new j(c1341a, c3618a, c3558a, 24);
                u uVar = new u();
                uVar.f15389a = jVar;
                uVar.f15390b = c3558a;
                uVar.f15391c = iVar;
                uVar.f15392d = application;
                j jVar2 = new j(c1341a, c1323c, c3618a, c3558a, jVar, uVar);
                j.f16073d = jVar2;
                a.f16790a = new G9.e(iVar, jVar2);
            }
        }
        if (this.noCodesSandwich != null) {
            f fVar = new f(this);
            G9.e eVar = a.f16790a;
            if (eVar == null) {
                throw new C2514B("Qonversion No-Codes has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion No-Codes.");
            }
            ((i) eVar.f4685b).f1942e = new C3979c(fVar);
        }
        result.a(null);
    }

    @Override // Ge.e
    public void onNoCodesEvent(@NotNull d event, @Nullable Map<String, ? extends Object> map) {
        InterfaceC4270g eventSink;
        InterfaceC4270g eventSink2;
        InterfaceC4270g eventSink3;
        InterfaceC4270g eventSink4;
        InterfaceC4270g eventSink5;
        InterfaceC4270g eventSink6;
        AbstractC3340k.e(event, "event");
        if (map == null) {
            map = w.f35433a;
        }
        String strF = this.gson.f(AbstractC2641B.E(new C2527k("payload", map)));
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            BaseEventStreamHandler baseEventStreamHandler = this.screenShownEventStreamHandler;
            if (baseEventStreamHandler == null || (eventSink = baseEventStreamHandler.getEventSink()) == null) {
                return;
            }
            eventSink.a(strF);
            return;
        }
        if (iOrdinal == 1) {
            BaseEventStreamHandler baseEventStreamHandler2 = this.finishedEventStreamHandler;
            if (baseEventStreamHandler2 == null || (eventSink2 = baseEventStreamHandler2.getEventSink()) == null) {
                return;
            }
            eventSink2.a(strF);
            return;
        }
        if (iOrdinal == 2) {
            BaseEventStreamHandler baseEventStreamHandler3 = this.actionStartedEventStreamHandler;
            if (baseEventStreamHandler3 == null || (eventSink3 = baseEventStreamHandler3.getEventSink()) == null) {
                return;
            }
            eventSink3.a(strF);
            return;
        }
        if (iOrdinal == 3) {
            BaseEventStreamHandler baseEventStreamHandler4 = this.actionFinishedEventStreamHandler;
            if (baseEventStreamHandler4 == null || (eventSink4 = baseEventStreamHandler4.getEventSink()) == null) {
                return;
            }
            eventSink4.a(strF);
            return;
        }
        if (iOrdinal == 4) {
            BaseEventStreamHandler baseEventStreamHandler5 = this.actionFailedEventStreamHandler;
            if (baseEventStreamHandler5 == null || (eventSink5 = baseEventStreamHandler5.getEventSink()) == null) {
                return;
            }
            eventSink5.a(strF);
            return;
        }
        if (iOrdinal != 5) {
            throw new Q((byte) 0, 9);
        }
        BaseEventStreamHandler baseEventStreamHandler6 = this.screenFailedToLoadEventStreamHandler;
        if (baseEventStreamHandler6 == null || (eventSink6 = baseEventStreamHandler6.getEventSink()) == null) {
            return;
        }
        eventSink6.a(strF);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setScreenPresentationConfig(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull uc.InterfaceC4280q r9) {
        /*
            r6 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.AbstractC3340k.e(r9, r0)
            if (r7 == 0) goto Lad
            Ge.h r0 = r6.noCodesSandwich
            r1 = 0
            if (r0 == 0) goto La9
            java.lang.String r2 = "animated"
            java.lang.Object r2 = r7.get(r2)
            boolean r3 = r2 instanceof java.lang.String
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L29
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = Bf.r.l0(r2)
            if (r2 != 0) goto L21
            goto L27
        L21:
            int r2 = r2.intValue()
            if (r2 == 0) goto L42
        L27:
            r5 = r4
            goto L42
        L29:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L38
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r3)
            if (r2 != 0) goto L42
            goto L27
        L38:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
        L42:
            if (r5 != 0) goto L4c
            ae.g r7 = new ae.g
            ae.h r2 = ae.h.f17653b
            r7.<init>(r2)
            goto L72
        L4c:
            java.lang.String r2 = "presentationStyle"
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.IllegalArgumentException -> L63
            if (r7 == 0) goto L63
            boolean r2 = r7 instanceof java.lang.String     // Catch: java.lang.IllegalArgumentException -> L63
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r7 = r1
        L5a:
            if (r7 == 0) goto L63
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.IllegalArgumentException -> L63
            ae.h r7 = ae.h.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L63
            goto L64
        L63:
            r7 = r1
        L64:
            if (r7 == 0) goto L6d
            ae.g r2 = new ae.g
            r2.<init>(r7)
            r7 = r2
            goto L72
        L6d:
            ae.g r7 = new ae.g
            r7.<init>()
        L72:
            boolean r2 = r0.f4749c
            if (r2 != 0) goto L97
            r0.f4749c = r4
            G9.e r2 = Yd.a.f16790a
            if (r2 == 0) goto L8f
            java.lang.String r3 = "delegate"
            Ge.g r4 = r0.f4750d
            kotlin.jvm.internal.AbstractC3340k.e(r4, r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            java.lang.Object r2 = r2.f4685b
            C8.i r2 = (C8.i) r2
            r2.f1943f = r3
            goto L97
        L8f:
            ef.B r7 = new ef.B
            java.lang.String r8 = "Qonversion No-Codes has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion No-Codes."
            r7.<init>(r8)
            throw r7
        L97:
            java.util.LinkedHashMap r2 = r0.f4748b
            if (r8 == 0) goto La1
            r2.put(r8, r7)
            ef.C r8 = ef.C2515C.f34653a
            goto La2
        La1:
            r8 = r1
        La2:
            if (r8 != 0) goto La9
            r2.clear()
            r0.f4747a = r7
        La9:
            r9.a(r1)
            return
        Lad:
            com.qonversion.flutter.sdk.qonversion_flutter_sdk.FlutterResult_CustomErrorsKt.noNecessaryDataError(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qonversion.flutter.sdk.qonversion_flutter_sdk.NoCodesPlugin.setScreenPresentationConfig(java.util.Map, java.lang.String, uc.q):void");
    }

    public final void showNoCodesScreen(@Nullable String str, @NotNull InterfaceC4280q result) {
        AbstractC3340k.e(result, "result");
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        if (this.noCodesSandwich != null) {
            G9.e eVar = a.f16790a;
            if (eVar == null) {
                throw new C2514B("Qonversion No-Codes has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion No-Codes.");
            }
            H.D((E) eVar.f4686c, null, new C2431a(eVar, str, null), 3);
        }
        result.a(null);
    }
}
