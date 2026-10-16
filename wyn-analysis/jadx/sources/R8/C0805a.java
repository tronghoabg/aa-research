package R8;

import Ef.H;
import Hf.k0;
import Hf.u0;
import Hf.x0;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import com.google.protobuf.ByteString;
import com.moloco.sdk.C1875h;
import com.moloco.sdk.C1877i;
import com.moloco.sdk.Q;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import db.C2403a;
import ef.C2527k;
import ef.C2532p;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.C4281r;
import y3.C4552j;

/* renamed from: R8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0805a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public Object f10436a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10437b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10438c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10439d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10440e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10441f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10442g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10443h;

    public C0805a(I i5, Integer num, Integer num2, String str, Kd.a aVar, Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, G0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f10437b = i5;
        this.f10436a = str;
        this.f10438c = customUserEventBuilderService;
        this.f10439d = externalLinkHandler;
        this.f10440e = eVar;
        this.f10441f = eVar2;
        x0 x0VarC = k0.c(null);
        this.f10442g = x0VarC;
        H.D(aVar, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.A(this, context, num, num2, null), 3);
        this.f10443h = k0.x(new Y3.l(x0VarC, 3), aVar, new u0(), null);
    }

    public static Boolean o() {
        return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable a(com.moloco.sdk.acm.recorder.b r12, java.lang.String r13, com.moloco.sdk.internal.services.bidtoken.g r14, lf.AbstractC3464c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.bidtoken.s
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.bidtoken.s r0 = (com.moloco.sdk.internal.services.bidtoken.s) r0
            int r1 = r0.f29545h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29545h = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.bidtoken.s r0 = new com.moloco.sdk.internal.services.bidtoken.s
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f29543f
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29545h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            Nf.d r12 = r0.f29542e
            com.moloco.sdk.internal.services.bidtoken.g r14 = r0.f29541d
            java.lang.String r13 = r0.f29540c
            com.moloco.sdk.acm.recorder.b r1 = r0.f29539b
            R8.a r0 = r0.f29538a
            Fe.e.U(r15)
            r15 = r12
            r12 = r1
            goto L56
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            Fe.e.U(r15)
            r0.f29538a = r11
            r0.f29539b = r12
            r0.f29540c = r13
            r0.f29541d = r14
            java.lang.Object r15 = r11.f10443h
            Nf.d r15 = (Nf.d) r15
            r0.f29542e = r15
            r0.f29545h = r3
            java.lang.Object r0 = r15.b(r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r0 = r11
        L56:
            r1 = 0
            boolean r2 = r0.c(r13, r14)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "result"
            java.lang.String r4 = "cbt_cached"
            if (r2 == 0) goto L8e
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "ClientBidTokenServiceImpl"
            java.lang.String r7 = "Bid token needs refresh, fetching new bid token"
            r10 = 0
            r8 = 0
            r9 = 4
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8b
            r0.f10436a = r13     // Catch: java.lang.Throwable -> L8b
            r0.f10442g = r14     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.acm.h r14 = new com.moloco.sdk.acm.h     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.internal.client_metrics_data.a[] r2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b     // Catch: java.lang.Throwable -> L8b
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.internal.client_metrics_data.b[] r2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "false"
            r14.a(r3, r2)     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.acm.recorder.c r12 = (com.moloco.sdk.acm.recorder.c) r12     // Catch: java.lang.Throwable -> L8b
            r12.a(r14)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r12 = r0.b(r13, r12)     // Catch: java.lang.Throwable -> L8b
            r0.f10437b = r12     // Catch: java.lang.Throwable -> L8b
            goto La1
        L8b:
            r0 = move-exception
            r12 = r0
            goto Lc2
        L8e:
            com.moloco.sdk.acm.h r13 = new com.moloco.sdk.acm.h     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.internal.client_metrics_data.a[] r14 = com.moloco.sdk.internal.client_metrics_data.a.f28494b     // Catch: java.lang.Throwable -> L8b
            r13.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.internal.client_metrics_data.b[] r14 = com.moloco.sdk.internal.client_metrics_data.b.f28496a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r14 = "true"
            r13.a(r3, r14)     // Catch: java.lang.Throwable -> L8b
            com.moloco.sdk.acm.recorder.c r12 = (com.moloco.sdk.acm.recorder.c) r12     // Catch: java.lang.Throwable -> L8b
            r12.a(r13)     // Catch: java.lang.Throwable -> L8b
        La1:
            java.lang.Object r12 = r0.f10437b     // Catch: java.lang.Throwable -> L8b
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L8b
            int r12 = r12.length()     // Catch: java.lang.Throwable -> L8b
            if (r12 != 0) goto Lba
            java.lang.Exception r12 = new java.lang.Exception     // Catch: java.lang.Throwable -> L8b
            java.lang.String r13 = "Client bid token is empty"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L8b
            ef.m r12 = Fe.e.z(r12)     // Catch: java.lang.Throwable -> L8b
            r15.a(r1)
            return r12
        Lba:
            java.lang.Object r12 = r0.f10437b     // Catch: java.lang.Throwable -> L8b
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L8b
            r15.a(r1)
            return r12
        Lc2:
            r15.a(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.C0805a.a(com.moloco.sdk.acm.recorder.b, java.lang.String, com.moloco.sdk.internal.services.bidtoken.g, lf.c):java.io.Serializable");
    }

    public String b(String str, com.moloco.sdk.acm.recorder.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Exception exc;
        String str2;
        long jCurrentTimeMillis;
        String str3;
        com.moloco.sdk.internal.services.bidtoken.r rVar = (com.moloco.sdk.internal.services.bidtoken.r) this.f10439d;
        com.moloco.sdk.internal.services.bidtoken.providers.l lVar = (com.moloco.sdk.internal.services.bidtoken.providers.l) this.f10441f;
        C8.i iVar = (C8.i) this.f10440e;
        com.moloco.sdk.internal.services.k kVar = (com.moloco.sdk.internal.services.k) this.f10438c;
        if (str.length() == 0) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("bid_token_build");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("result", "failure");
            hVar.a("reason", "empty_public_key");
            cVar.a(hVar);
            return "";
        }
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        com.moloco.sdk.acm.l lVarC = cVar.c("bid_token_build_time_ms");
        try {
            kVar.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            str3 = "rsa";
        } catch (Exception e7) {
            exc = e7;
            str2 = "";
        }
        try {
            byte[] bArrD = iVar.d(str);
            lVar.a();
            Q qA = rVar.a((com.moloco.sdk.internal.services.bidtoken.providers.k) lVar.d(), (com.moloco.sdk.internal.services.bidtoken.g) this.f10442g);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "BidToken Component: " + qA, false, 4, null);
            byte[] bArrEncode = Base64.encode(qA.toByteArray(), 0);
            str3 = "aes";
            AbstractC3340k.b(bArrEncode);
            Cipher cipher = Cipher.getInstance((String) ((C2532p) iVar.f1941d).getValue());
            cipher.init(1, (SecretKeySpec) iVar.f1942e, (IvParameterSpec) ((C2532p) iVar.f1943f).getValue());
            byte[] bArrDoFinal = cipher.doFinal(bArrEncode);
            AbstractC3340k.d(bArrDoFinal, "doFinal(...)");
            byte[] bArrEncode2 = Base64.encode(bArrDoFinal, 0);
            AbstractC3340k.b(bArrEncode2);
            C1875h c1875hD = C1877i.d();
            c1875hD.a(ByteString.copyFrom(bArrD));
            c1875hD.b(ByteString.copyFrom(bArrEncode2));
            byte[] byteArray = ((C1877i) c1875hD.build()).toByteArray();
            AbstractC3340k.d(byteArray, "toByteArray(...)");
            String strEncodeToString = Base64.encodeToString(byteArray, 0);
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            lVarC.a("result", "success");
            cVar.b(lVarC);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("bid_token_build");
            hVar2.a("result", "success");
            cVar.a(hVar2);
            StringBuilder sb2 = new StringBuilder("Client bid token build time: ");
            kVar.getClass();
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append(" ms");
            MolocoLogger.info$default(molocoLogger, "ClientBidTokenServiceImpl", sb2.toString(), null, false, 12, null);
            return "v2:" + strEncodeToString;
        } catch (Exception e10) {
            exc = e10;
            str2 = str3;
            String simpleName = exc.getClass().getSimpleName();
            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
            MolocoLogger.warn$default(molocoLogger2, "ClientBidTokenServiceImpl", "Client bid token build failed: ".concat(simpleName), exc, false, 8, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("bid_token_build");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar3.a("result", "failure");
            hVar3.a("reason", simpleName);
            if (str2.length() > 0) {
                hVar3.a("step", str2);
            }
            MolocoLogger.debugBuildLog$default(molocoLogger2, "ClientBidTokenServiceImpl", "Recording metric failure: " + hVar3.f28418b + ", tags: " + ff.o.w0(hVar3.f28417a, ",", null, null, null, 62), false, 4, null);
            cVar.a(hVar3);
            lVarC.a("result", "failure");
            lVarC.a("reason", simpleName);
            cVar.b(lVarC);
            return "";
        }
    }

    public boolean c(String str, com.moloco.sdk.internal.services.bidtoken.g gVar) {
        if (!AbstractC3340k.a((String) this.f10436a, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "rp changed, needs refresh", false, 4, null);
            return true;
        }
        com.moloco.sdk.internal.services.bidtoken.g gVar2 = (com.moloco.sdk.internal.services.bidtoken.g) this.f10442g;
        this.f10442g = gVar;
        boolean zA = AbstractC3340k.a(gVar2, gVar);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", !zA ? "config updated" : "config didn't change", false, 4, null);
        if (!zA) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (((String) this.f10437b).length() == 0) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (((com.moloco.sdk.internal.services.bidtoken.providers.l) this.f10441f).b()) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "Bid token doesn't need refresh", false, 4, null);
        return false;
    }

    public boolean d() {
        Context context;
        Context context2 = (Context) this.f10439d;
        if (context2 == null) {
            return false;
        }
        db.d dVar = (db.d) this.f10437b;
        if (dVar != null) {
            context2.unregisterReceiver(dVar);
            this.f10437b = null;
        }
        db.d dVar2 = (db.d) this.f10438c;
        if (dVar2 != null && (context = (Context) this.f10439d) != null) {
            context.unregisterReceiver(dVar2);
            this.f10438c = null;
        }
        if (((L1.d) this.f10436a) != null) {
            AudioManager audioManager = (AudioManager) this.f10440e;
            AbstractC3340k.b(audioManager);
            L1.d dVar3 = (L1.d) this.f10436a;
            AbstractC3340k.b(dVar3);
            int iA = Build.VERSION.SDK_INT >= 26 ? L1.e.a(audioManager, A0.h.l(dVar3.f6824f)) : audioManager.abandonAudioFocus(dVar3.f6820b);
            this.f10436a = null;
            if (iA != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        x0 x0Var = (x0) this.f10442g;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t) x0Var.getValue();
        if (tVar != null) {
            tVar.destroy();
        }
        x0Var.j(null);
    }

    public void e(int i5, int i10, int i11) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.adjustStreamVolume(i5, i10, i11);
    }

    public void f(Map map) {
        Long lT = AbstractC2641B.t(map.get("downTime"));
        AbstractC3340k.b(lT);
        long jLongValue = lT.longValue();
        Long lT2 = AbstractC2641B.t(map.get("eventTime"));
        AbstractC3340k.b(lT2);
        long jLongValue2 = lT2.longValue();
        Object obj = map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = map.get("keyCode");
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = map.get("repeatCount");
        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj3).intValue();
        Object obj4 = map.get("metaState");
        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) obj4).intValue();
        Object obj5 = map.get("deviceId");
        AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue5 = ((Integer) obj5).intValue();
        Object obj6 = map.get("scanCode");
        AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue6 = ((Integer) obj6).intValue();
        Object obj7 = map.get("flags");
        AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue7 = ((Integer) obj7).intValue();
        Object obj8 = map.get("source");
        AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Int");
        KeyEvent keyEvent = new KeyEvent(jLongValue, jLongValue2, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, ((Integer) obj8).intValue());
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.dispatchMediaKeyEvent(keyEvent);
    }

    public ArrayList g() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        List availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        AbstractC3340k.d(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        List<AudioDeviceInfo> list = availableCommunicationDevices;
        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
        for (AudioDeviceInfo audioDeviceInfo : list) {
            AbstractC3340k.b(audioDeviceInfo);
            arrayList.add(AbstractC2641B.r(audioDeviceInfo));
        }
        return arrayList;
    }

    public Map h() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return null;
        }
        return AbstractC2641B.r(communicationDevice);
    }

    public ArrayList i(int i5) {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        AudioDeviceInfo[] devices = audioManager.getDevices(i5);
        AbstractC3340k.d(devices, "getDevices(...)");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(AbstractC2641B.r(audioDeviceInfo));
        }
        return arrayList;
    }

    public ArrayList j() throws IOException {
        int i5 = 10;
        char c10 = 1;
        char c11 = 0;
        int i10 = 2;
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        List microphones = audioManager.getMicrophones();
        AbstractC3340k.d(microphones, "getMicrophones(...)");
        Iterator it = microphones.iterator();
        while (it.hasNext()) {
            MicrophoneInfo microphoneInfoK = com.bytedance.sdk.component.lw.oa.yo.oa.a.k(it.next());
            List frequencyResponse = microphoneInfoK.getFrequencyResponse();
            AbstractC3340k.d(frequencyResponse, "getFrequencyResponse(...)");
            List<Pair> list = frequencyResponse;
            ArrayList arrayList2 = new ArrayList(ff.p.a0(list, i5));
            for (Pair pair : list) {
                Double dValueOf = Double.valueOf(((Number) pair.first).floatValue());
                Double dValueOf2 = Double.valueOf(((Number) pair.second).floatValue());
                Double[] dArr = new Double[i10];
                dArr[c11] = dValueOf;
                dArr[c10] = dValueOf2;
                arrayList2.add(AbstractC3935e.D(dArr));
            }
            List channelMapping = microphoneInfoK.getChannelMapping();
            AbstractC3340k.d(channelMapping, "getChannelMapping(...)");
            List<Pair> list2 = channelMapping;
            ArrayList arrayList3 = new ArrayList(ff.p.a0(list2, i5));
            for (Pair pair2 : list2) {
                Integer numValueOf = Integer.valueOf(((Number) pair2.first).intValue());
                Integer numValueOf2 = Integer.valueOf(((Number) pair2.second).intValue());
                Integer[] numArr = new Integer[i10];
                numArr[c11] = numValueOf;
                numArr[c10] = numValueOf2;
                arrayList3.add(AbstractC3935e.D(numArr));
            }
            C2527k c2527k = new C2527k("description", microphoneInfoK.getDescription());
            C2527k c2527k2 = new C2527k("id", Integer.valueOf(microphoneInfoK.getId()));
            C2527k c2527k3 = new C2527k("type", Integer.valueOf(microphoneInfoK.getType()));
            C2527k c2527k4 = new C2527k("address", microphoneInfoK.getAddress());
            int i11 = i5;
            C2527k c2527k5 = new C2527k("location", Integer.valueOf(microphoneInfoK.getLocation()));
            char c12 = c10;
            C2527k c2527k6 = new C2527k("group", Integer.valueOf(microphoneInfoK.getGroup()));
            char c13 = c11;
            C2527k c2527k7 = new C2527k("indexInTheGroup", Integer.valueOf(microphoneInfoK.getIndexInTheGroup()));
            MicrophoneInfo.Coordinate3F position = microphoneInfoK.getPosition();
            AbstractC3340k.d(position, "getPosition(...)");
            int i12 = i10;
            C2527k c2527k8 = new C2527k("position", AbstractC2641B.k(position));
            MicrophoneInfo.Coordinate3F orientation = microphoneInfoK.getOrientation();
            AbstractC3340k.d(orientation, "getOrientation(...)");
            C2527k c2527k9 = new C2527k(AdUnitActivity.EXTRA_ORIENTATION, AbstractC2641B.k(orientation));
            C2527k c2527k10 = new C2527k("frequencyResponse", arrayList2);
            C2527k c2527k11 = new C2527k("channelMapping", arrayList3);
            C2527k c2527k12 = new C2527k("sensitivity", Float.valueOf(microphoneInfoK.getSensitivity()));
            C2527k c2527k13 = new C2527k("maxSpl", Float.valueOf(microphoneInfoK.getMaxSpl()));
            C2527k c2527k14 = new C2527k("minSpl", Float.valueOf(microphoneInfoK.getMinSpl()));
            C2527k c2527k15 = new C2527k("directionality", Integer.valueOf(microphoneInfoK.getDirectionality()));
            C2527k[] c2527kArr = new C2527k[15];
            c2527kArr[c13] = c2527k;
            c2527kArr[c12] = c2527k2;
            c2527kArr[i12] = c2527k3;
            c2527kArr[3] = c2527k4;
            c2527kArr[4] = c2527k5;
            c2527kArr[5] = c2527k6;
            c2527kArr[6] = c2527k7;
            c2527kArr[7] = c2527k8;
            c2527kArr[8] = c2527k9;
            c2527kArr[9] = c2527k10;
            c2527kArr[i11] = c2527k11;
            c2527kArr[11] = c2527k12;
            c2527kArr[12] = c2527k13;
            c2527kArr[13] = c2527k14;
            c2527kArr[14] = c2527k15;
            arrayList.add(AbstractC2640A.R(c2527kArr));
            i5 = i11;
            c10 = c12;
            c11 = c13;
            i10 = i12;
        }
        return arrayList;
    }

    public Integer k(int i5) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMaxVolume(i5));
    }

    public Integer l(int i5) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMinVolume(i5));
    }

    public void m(String str, Object... objArr) {
        Iterator it = ((ArrayList) this.f10442g).iterator();
        while (it.hasNext()) {
            C2403a c2403a = (C2403a) it.next();
            ArrayList arrayListO0 = ff.m.O0(objArr);
            C4281r c4281r = c2403a.f34203a;
            AbstractC3340k.b(c4281r);
            c4281r.a(str, arrayListO0, null);
        }
    }

    public Boolean n() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        return Boolean.valueOf(audioManager.isBluetoothScoOn());
    }

    public Boolean p() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        return Boolean.valueOf(audioManager.isMicrophoneMute());
    }

    public Boolean q() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    public void r() {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.loadSoundEffects();
    }

    public boolean s(List args) {
        boolean zBooleanValue;
        AbstractC3340k.e(args, "args");
        if (((L1.d) this.f10436a) != null) {
            return true;
        }
        Object obj = args.get(0);
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) obj;
        Object obj2 = map.get("gainType");
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        AudioAttributesCompat audioAttributesCompat = L1.d.f6818g;
        if (iIntValue != 1 && iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
            throw new IllegalArgumentException(AbstractC3256n.g(iIntValue, "Illegal audio focus gain type "));
        }
        db.c cVar = new db.c(this);
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            AbstractC3340k.b(map2);
            int i5 = AudioAttributesCompat.f18706b;
            C4552j aVar = Build.VERSION.SDK_INT >= 26 ? new L1.a(15) : new C4552j(15);
            Object obj3 = map2.get("contentType");
            AudioAttributes.Builder builder = (AudioAttributes.Builder) aVar.f48001b;
            if (obj3 != null) {
                Object obj4 = map2.get("contentType");
                AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                builder.setContentType(((Integer) obj4).intValue());
            }
            if (map2.get("flags") != null) {
                Object obj5 = map2.get("flags");
                AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Int");
                builder.setFlags(((Integer) obj5).intValue());
            }
            if (map2.get("usage") != null) {
                Object obj6 = map2.get("usage");
                AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                aVar.t(((Integer) obj6).intValue());
            }
            AudioAttributesImpl audioAttributesImplH = aVar.h();
            audioAttributesCompat = new AudioAttributesCompat();
            audioAttributesCompat.f18707a = audioAttributesImplH;
        }
        AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
        if (map.get("willPauseWhenDucked") != null) {
            Object obj7 = map.get("willPauseWhenDucked");
            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            zBooleanValue = ((Boolean) obj7).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f10436a = new L1.d(iIntValue, cVar, handler, audioAttributesCompat2, zBooleanValue);
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        L1.d dVar = (L1.d) this.f10436a;
        AbstractC3340k.b(dVar);
        boolean z2 = (Build.VERSION.SDK_INT >= 26 ? L1.e.b(audioManager, A0.h.l(dVar.f6824f)) : audioManager.requestAudioFocus(dVar.f6820b, dVar.f6822d.f18707a.a(), dVar.f6819a)) == 1;
        if (z2) {
            if (((db.d) this.f10437b) == null) {
                this.f10437b = new db.d(this, 0);
                Context context = (Context) this.f10439d;
                AbstractC3340k.b(context);
                Y0.e.registerReceiver(context, (db.d) this.f10437b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
            }
            if (((db.d) this.f10438c) == null) {
                this.f10438c = new db.d(this, 1);
                Context context2 = (Context) this.f10439d;
                AbstractC3340k.b(context2);
                Y0.e.registerReceiver(context2, (db.d) this.f10438c, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
            }
        }
        return z2;
    }

    public void t(int i5) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.setAllowedCapturePolicy(i5);
    }

    public void u(boolean z2) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.setBluetoothScoOn(z2);
    }

    public boolean v(int i5) {
        Iterator it = ((ArrayList) this.f10443h).iterator();
        while (it.hasNext()) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it.next();
            if (audioDeviceInfo.getId() == i5) {
                AudioManager audioManager = (AudioManager) this.f10440e;
                AbstractC3340k.b(audioManager);
                return audioManager.setCommunicationDevice(audioDeviceInfo);
            }
        }
        return false;
    }

    public void w(boolean z2) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.setMicrophoneMute(z2);
    }

    public void x(boolean z2) {
        AudioManager audioManager = (AudioManager) this.f10440e;
        AbstractC3340k.b(audioManager);
        audioManager.setSpeakerphoneOn(z2);
    }
}
