package db;

import E5.Q;
import R8.C0805a;
import android.media.AudioManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2403a implements InterfaceC4279p {

    /* renamed from: b, reason: collision with root package name */
    public static C0805a f34202b;

    /* renamed from: a, reason: collision with root package name */
    public C4281r f34203a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(call, "call");
        try {
            Object obj = call.f46760b;
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            String str = call.f46759a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1758921066:
                        if (!str.equals("getCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Q(31);
                            }
                            C0805a c0805a = f34202b;
                            AbstractC3340k.b(c0805a);
                            ((g) interfaceC4280q).a(c0805a.h());
                            return;
                        }
                    case -1698305881:
                        if (!str.equals("getDevices")) {
                            break;
                        } else {
                            C0805a c0805a2 = f34202b;
                            AbstractC3340k.b(c0805a2);
                            Object obj2 = list.get(0);
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                            ((g) interfaceC4280q).a(c0805a2.i(((Integer) obj2).intValue()));
                            return;
                        }
                    case -1679670739:
                        if (!str.equals("isMicrophoneMute")) {
                            break;
                        } else {
                            C0805a c0805a3 = f34202b;
                            AbstractC3340k.b(c0805a3);
                            ((g) interfaceC4280q).a(c0805a3.p());
                            return;
                        }
                    case -1582239800:
                        if (!str.equals("getStreamMaxVolume")) {
                            break;
                        } else {
                            C0805a c0805a4 = f34202b;
                            AbstractC3340k.b(c0805a4);
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                            ((g) interfaceC4280q).a(c0805a4.k(((Integer) obj3).intValue()));
                            return;
                        }
                    case -1562927400:
                        if (!str.equals("isSpeakerphoneOn")) {
                            break;
                        } else {
                            C0805a c0805a5 = f34202b;
                            AbstractC3340k.b(c0805a5);
                            ((g) interfaceC4280q).a(c0805a5.q());
                            return;
                        }
                    case -1524320654:
                        if (!str.equals("isHapticPlaybackSupported")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new Q(29);
                            }
                            AbstractC3340k.b(f34202b);
                            ((g) interfaceC4280q).a(C0805a.o());
                            return;
                        }
                    case -1504647535:
                        if (!str.equals("requestAudioFocus")) {
                            break;
                        } else {
                            C0805a c0805a6 = f34202b;
                            AbstractC3340k.b(c0805a6);
                            ((g) interfaceC4280q).a(Boolean.valueOf(c0805a6.s(list)));
                            return;
                        }
                    case -1413157019:
                        if (!str.equals("setMicrophoneMute")) {
                            break;
                        } else {
                            C0805a c0805a7 = f34202b;
                            AbstractC3340k.b(c0805a7);
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            c0805a7.w(((Boolean) obj4).booleanValue());
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -1296413680:
                        if (!str.equals("setSpeakerphoneOn")) {
                            break;
                        } else {
                            C0805a c0805a8 = f34202b;
                            AbstractC3340k.b(c0805a8);
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            c0805a8.x(((Boolean) obj5).booleanValue());
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -1285190630:
                        if (!str.equals("isBluetoothScoOn")) {
                            break;
                        } else {
                            C0805a c0805a9 = f34202b;
                            AbstractC3340k.b(c0805a9);
                            ((g) interfaceC4280q).a(c0805a9.n());
                            return;
                        }
                    case -1197068311:
                        if (!str.equals("adjustStreamVolume")) {
                            break;
                        } else {
                            C0805a c0805a10 = f34202b;
                            AbstractC3340k.b(c0805a10);
                            Object obj6 = list.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) obj6).intValue();
                            Object obj7 = list.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue2 = ((Integer) obj7).intValue();
                            Object obj8 = list.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            c0805a10.e(iIntValue, iIntValue2, ((Integer) obj8).intValue());
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -1091382445:
                        if (!str.equals("getMicrophones")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new Q(28);
                            }
                            C0805a c0805a11 = f34202b;
                            AbstractC3340k.b(c0805a11);
                            ((g) interfaceC4280q).a(c0805a11.j());
                            return;
                        }
                    case -1079290158:
                        if (!str.equals("setAllowedCapturePolicy")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new Q(29);
                            }
                            C0805a c0805a12 = f34202b;
                            AbstractC3340k.b(c0805a12);
                            Object obj9 = list.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Int");
                            c0805a12.t(((Integer) obj9).intValue());
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -1018676910:
                        if (!str.equals("setBluetoothScoOn")) {
                            break;
                        } else {
                            C0805a c0805a13 = f34202b;
                            AbstractC3340k.b(c0805a13);
                            Object obj10 = list.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            c0805a13.u(((Boolean) obj10).booleanValue());
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -809761226:
                        if (!str.equals("getStreamMinVolume")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new Q(28);
                            }
                            C0805a c0805a14 = f34202b;
                            AbstractC3340k.b(c0805a14);
                            Object obj11 = list.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Int");
                            ((g) interfaceC4280q).a(c0805a14.l(((Integer) obj11).intValue()));
                            return;
                        }
                    case -763512583:
                        if (!str.equals("loadSoundEffects")) {
                            break;
                        } else {
                            C0805a c0805a15 = f34202b;
                            AbstractC3340k.b(c0805a15);
                            c0805a15.r();
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -694417919:
                        if (!str.equals("isMusicActive")) {
                            break;
                        } else {
                            C0805a c0805a16 = f34202b;
                            AbstractC3340k.b(c0805a16);
                            AudioManager audioManager = (AudioManager) c0805a16.f10440e;
                            AbstractC3340k.b(audioManager);
                            ((g) interfaceC4280q).a(Boolean.valueOf(audioManager.isMusicActive()));
                            return;
                        }
                    case -580980717:
                        if (!str.equals("startBluetoothSco")) {
                            break;
                        } else {
                            C0805a c0805a17 = f34202b;
                            AbstractC3340k.b(c0805a17);
                            AudioManager audioManager2 = (AudioManager) c0805a17.f10440e;
                            AbstractC3340k.b(audioManager2);
                            audioManager2.startBluetoothSco();
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case -445792758:
                        if (!str.equals("setCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Q(31);
                            }
                            C0805a c0805a18 = f34202b;
                            AbstractC3340k.b(c0805a18);
                            Object obj12 = list.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.Int");
                            ((g) interfaceC4280q).a(Boolean.valueOf(c0805a18.v(((Integer) obj12).intValue())));
                            return;
                        }
                    case -380792370:
                        if (!str.equals("getStreamVolumeDb")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new Q(28);
                            }
                            C0805a c0805a19 = f34202b;
                            AbstractC3340k.b(c0805a19);
                            Object obj13 = list.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue3 = ((Integer) obj13).intValue();
                            Object obj14 = list.get(1);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue4 = ((Integer) obj14).intValue();
                            Object obj15 = list.get(2);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue5 = ((Integer) obj15).intValue();
                            AudioManager audioManager3 = (AudioManager) c0805a19.f10440e;
                            AbstractC3340k.b(audioManager3);
                            ((g) interfaceC4280q).a(Float.valueOf(audioManager3.getStreamVolumeDb(iIntValue3, iIntValue4, iIntValue5)));
                            return;
                        }
                    case -75324903:
                        if (!str.equals("getMode")) {
                            break;
                        } else {
                            C0805a c0805a20 = f34202b;
                            AbstractC3340k.b(c0805a20);
                            AudioManager audioManager4 = (AudioManager) c0805a20.f10440e;
                            AbstractC3340k.b(audioManager4);
                            ((g) interfaceC4280q).a(Integer.valueOf(audioManager4.getMode()));
                            return;
                        }
                    case 152385829:
                        if (!str.equals("dispatchMediaKeyEvent")) {
                            break;
                        } else {
                            C0805a c0805a21 = f34202b;
                            AbstractC3340k.b(c0805a21);
                            Object obj16 = list.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            c0805a21.f((Map) obj16);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 160987616:
                        if (!str.equals("getParameters")) {
                            break;
                        } else {
                            C0805a c0805a22 = f34202b;
                            AbstractC3340k.b(c0805a22);
                            String str2 = (String) list.get(0);
                            AudioManager audioManager5 = (AudioManager) c0805a22.f10440e;
                            AbstractC3340k.b(audioManager5);
                            String parameters = audioManager5.getParameters(str2);
                            AbstractC3340k.d(parameters, "getParameters(...)");
                            ((g) interfaceC4280q).a(parameters);
                            return;
                        }
                    case 186762163:
                        if (!str.equals("stopBluetoothSco")) {
                            break;
                        } else {
                            C0805a c0805a23 = f34202b;
                            AbstractC3340k.b(c0805a23);
                            AudioManager audioManager6 = (AudioManager) c0805a23.f10440e;
                            AbstractC3340k.b(audioManager6);
                            audioManager6.stopBluetoothSco();
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 276698416:
                        if (!str.equals("getStreamVolume")) {
                            break;
                        } else {
                            C0805a c0805a24 = f34202b;
                            AbstractC3340k.b(c0805a24);
                            Object obj17 = list.get(0);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue6 = ((Integer) obj17).intValue();
                            AudioManager audioManager7 = (AudioManager) c0805a24.f10440e;
                            AbstractC3340k.b(audioManager7);
                            ((g) interfaceC4280q).a(Integer.valueOf(audioManager7.getStreamVolume(iIntValue6)));
                            return;
                        }
                    case 469094495:
                        if (!str.equals("isBluetoothScoAvailableOffCall")) {
                            break;
                        } else {
                            C0805a c0805a25 = f34202b;
                            AbstractC3340k.b(c0805a25);
                            AudioManager audioManager8 = (AudioManager) c0805a25.f10440e;
                            AbstractC3340k.b(audioManager8);
                            ((g) interfaceC4280q).a(Boolean.valueOf(audioManager8.isBluetoothScoAvailableOffCall()));
                            return;
                        }
                    case 623794710:
                        if (!str.equals("getRingerMode")) {
                            break;
                        } else {
                            C0805a c0805a26 = f34202b;
                            AbstractC3340k.b(c0805a26);
                            AudioManager audioManager9 = (AudioManager) c0805a26.f10440e;
                            AbstractC3340k.b(audioManager9);
                            ((g) interfaceC4280q).a(Integer.valueOf(audioManager9.getRingerMode()));
                            return;
                        }
                    case 935118828:
                        if (!str.equals("setParameters")) {
                            break;
                        } else {
                            C0805a c0805a27 = f34202b;
                            AbstractC3340k.b(c0805a27);
                            String str3 = (String) list.get(0);
                            AudioManager audioManager10 = (AudioManager) c0805a27.f10440e;
                            AbstractC3340k.b(audioManager10);
                            audioManager10.setParameters(str3);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 954131337:
                        if (!str.equals("adjustVolume")) {
                            break;
                        } else {
                            C0805a c0805a28 = f34202b;
                            AbstractC3340k.b(c0805a28);
                            Object obj18 = list.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue7 = ((Integer) obj18).intValue();
                            Object obj19 = list.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue8 = ((Integer) obj19).intValue();
                            AudioManager audioManager11 = (AudioManager) c0805a28.f10440e;
                            AbstractC3340k.b(audioManager11);
                            audioManager11.adjustVolume(iIntValue7, iIntValue8);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 976310915:
                        if (!str.equals("isStreamMute")) {
                            break;
                        } else {
                            C0805a c0805a29 = f34202b;
                            AbstractC3340k.b(c0805a29);
                            Object obj20 = list.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue9 = ((Integer) obj20).intValue();
                            AudioManager audioManager12 = (AudioManager) c0805a29.f10440e;
                            AbstractC3340k.b(audioManager12);
                            ((g) interfaceC4280q).a(Boolean.valueOf(audioManager12.isStreamMute(iIntValue9)));
                            return;
                        }
                    case 1084758859:
                        if (!str.equals("getProperty")) {
                            break;
                        } else {
                            C0805a c0805a30 = f34202b;
                            AbstractC3340k.b(c0805a30);
                            String str4 = (String) list.get(0);
                            AudioManager audioManager13 = (AudioManager) c0805a30.f10440e;
                            AbstractC3340k.b(audioManager13);
                            String property = audioManager13.getProperty(str4);
                            AbstractC3340k.d(property, "getProperty(...)");
                            ((g) interfaceC4280q).a(property);
                            return;
                        }
                    case 1163405254:
                        if (!str.equals("getAllowedCapturePolicy")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new Q(29);
                            }
                            C0805a c0805a31 = f34202b;
                            AbstractC3340k.b(c0805a31);
                            AudioManager audioManager14 = (AudioManager) c0805a31.f10440e;
                            AbstractC3340k.b(audioManager14);
                            ((g) interfaceC4280q).a(Integer.valueOf(audioManager14.getAllowedCapturePolicy()));
                            return;
                        }
                    case 1187450940:
                        if (!str.equals("setStreamVolume")) {
                            break;
                        } else {
                            C0805a c0805a32 = f34202b;
                            AbstractC3340k.b(c0805a32);
                            Object obj21 = list.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue10 = ((Integer) obj21).intValue();
                            Object obj22 = list.get(1);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue11 = ((Integer) obj22).intValue();
                            Object obj23 = list.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue12 = ((Integer) obj23).intValue();
                            AudioManager audioManager15 = (AudioManager) c0805a32.f10440e;
                            AbstractC3340k.b(audioManager15);
                            audioManager15.setStreamVolume(iIntValue10, iIntValue11, iIntValue12);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1241312831:
                        if (!str.equals("clearCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Q(31);
                            }
                            C0805a c0805a33 = f34202b;
                            AbstractC3340k.b(c0805a33);
                            AudioManager audioManager16 = (AudioManager) c0805a33.f10440e;
                            AbstractC3340k.b(audioManager16);
                            audioManager16.clearCommunicationDevice();
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1258134830:
                        if (!str.equals("adjustSuggestedStreamVolume")) {
                            break;
                        } else {
                            C0805a c0805a34 = f34202b;
                            AbstractC3340k.b(c0805a34);
                            Object obj24 = list.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue13 = ((Integer) obj24).intValue();
                            Object obj25 = list.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue14 = ((Integer) obj25).intValue();
                            Object obj26 = list.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue15 = ((Integer) obj26).intValue();
                            AudioManager audioManager17 = (AudioManager) c0805a34.f10440e;
                            AbstractC3340k.b(audioManager17);
                            audioManager17.adjustSuggestedStreamVolume(iIntValue13, iIntValue14, iIntValue15);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1357290231:
                        if (!str.equals("abandonAudioFocus")) {
                            break;
                        } else {
                            C0805a c0805a35 = f34202b;
                            AbstractC3340k.b(c0805a35);
                            ((g) interfaceC4280q).a(Boolean.valueOf(c0805a35.d()));
                            return;
                        }
                    case 1378317714:
                        if (!str.equals("unloadSoundEffects")) {
                            break;
                        } else {
                            C0805a c0805a36 = f34202b;
                            AbstractC3340k.b(c0805a36);
                            AudioManager audioManager18 = (AudioManager) c0805a36.f10440e;
                            AbstractC3340k.b(audioManager18);
                            audioManager18.unloadSoundEffects();
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1397925922:
                        if (!str.equals("setRingerMode")) {
                            break;
                        } else {
                            C0805a c0805a37 = f34202b;
                            AbstractC3340k.b(c0805a37);
                            Object obj27 = list.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue16 = ((Integer) obj27).intValue();
                            AudioManager audioManager19 = (AudioManager) c0805a37.f10440e;
                            AbstractC3340k.b(audioManager19);
                            audioManager19.setRingerMode(iIntValue16);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1504508844:
                        if (!str.equals("playSoundEffect")) {
                            break;
                        } else {
                            C0805a c0805a38 = f34202b;
                            AbstractC3340k.b(c0805a38);
                            Object obj28 = list.get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue17 = ((Integer) obj28).intValue();
                            Double d3 = (Double) list.get(1);
                            if (d3 != null) {
                                AudioManager audioManager20 = (AudioManager) c0805a38.f10440e;
                                AbstractC3340k.b(audioManager20);
                                audioManager20.playSoundEffect(iIntValue17, (float) d3.doubleValue());
                            } else {
                                AudioManager audioManager21 = (AudioManager) c0805a38.f10440e;
                                AbstractC3340k.b(audioManager21);
                                audioManager21.playSoundEffect(iIntValue17);
                            }
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1570996442:
                        if (!str.equals("getAvailableCommunicationDevices")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Q(31);
                            }
                            C0805a c0805a39 = f34202b;
                            AbstractC3340k.b(c0805a39);
                            ((g) interfaceC4280q).a(c0805a39.g());
                            return;
                        }
                    case 1984784677:
                        if (!str.equals("setMode")) {
                            break;
                        } else {
                            C0805a c0805a40 = f34202b;
                            AbstractC3340k.b(c0805a40);
                            Object obj29 = list.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue18 = ((Integer) obj29).intValue();
                            AudioManager audioManager22 = (AudioManager) c0805a40.f10440e;
                            AbstractC3340k.b(audioManager22);
                            audioManager22.setMode(iIntValue18);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    case 1986792688:
                        if (!str.equals("isVolumeFixed")) {
                            break;
                        } else {
                            C0805a c0805a41 = f34202b;
                            AbstractC3340k.b(c0805a41);
                            AudioManager audioManager23 = (AudioManager) c0805a41.f10440e;
                            AbstractC3340k.b(audioManager23);
                            ((g) interfaceC4280q).a(Boolean.valueOf(audioManager23.isVolumeFixed()));
                            return;
                        }
                    case 2093966320:
                        if (!str.equals("generateAudioSessionId")) {
                            break;
                        } else {
                            C0805a c0805a42 = f34202b;
                            AbstractC3340k.b(c0805a42);
                            AudioManager audioManager24 = (AudioManager) c0805a42.f10440e;
                            AbstractC3340k.b(audioManager24);
                            ((g) interfaceC4280q).a(Integer.valueOf(audioManager24.generateAudioSessionId()));
                            return;
                        }
                }
            }
            ((g) interfaceC4280q).c();
        } catch (Exception e7) {
            e7.printStackTrace();
            ((g) interfaceC4280q).b("Error: " + e7, null, null);
        }
    }
}
