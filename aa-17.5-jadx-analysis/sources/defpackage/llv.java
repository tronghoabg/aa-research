package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.media.AudioAttributesCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class llv implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ llv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v101, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v104, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v107, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v110, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v90, types: [java.lang.Object, xyc] */
    @Override // java.util.function.Supplier
    public final Object get() {
        NetworkCapabilities networkCapabilities;
        WifiInfo wifiInfo;
        PlaybackStateCompat playbackStateCompatA = null;
        dn dnVar = null;
        int i = 1;
        switch (this.b) {
            case 0:
                ajdr ajdrVar = ((dq) ((llu) this.a).b).c;
                Object obj = ajdrVar.a;
                if (((MediaSessionCompat.Token) obj).a() != null) {
                    try {
                        playbackStateCompatA = ((MediaSessionCompat.Token) obj).a().a();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                    }
                } else {
                    PlaybackState playbackState = ((MediaController) ajdrVar.e).getPlaybackState();
                    if (playbackState != null) {
                        playbackStateCompatA = PlaybackStateCompat.a(playbackState);
                    }
                }
                return (AaPlaybackState) spu.aT(playbackStateCompatA, new llx(i));
            case 1:
                return "The car app does not have " + ((String) this.a) + " permission";
            case 2:
                return (lmd) spu.aT(((dq) ((llu) this.a).b).a(), new llx(0));
            case 3:
                List<MediaSession.QueueItem> queue = ((MediaController) ((dq) ((llu) this.a).b).c.e).getQueue();
                return lmb.g(queue != null ? MediaSessionCompat.QueueItem.a(queue) : null, new lka(4));
            case 4:
                MediaController.PlaybackInfo playbackInfo = ((MediaController) ((dq) ((llu) this.a).b).c.e).getPlaybackInfo();
                if (playbackInfo != null) {
                    int playbackType = playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    int i2 = AudioAttributesCompat.b;
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                    dnVar = new dn(playbackType);
                }
                return (llu) spu.aT(dnVar, new llx(2));
            case 5:
                return (Bundle) new ntn(((MediaController) ((dq) ((llu) this.a).b).c.e).getExtras()).i(Bundle.EMPTY);
            case 6:
                return ((MediaController) ((dq) ((llu) this.a).b).c.e).getQueueTitle();
            case 7:
                return ((dq) ((llu) this.a).b).c();
            case 8:
                return new IllegalArgumentException("Messaging app not found id=".concat((String) this.a));
            case 9:
                Optional optionalA = mir.a((String) this.a);
                return true != optionalA.isPresent() ? optionalA : Optional.ofNullable(new rjg((RadioProgramSelector.RadioProgramIdentifier) optionalA.get()).a());
            case 10:
                return lws.g((RadioProgramSelector) this.a, 1);
            case 11:
                pbx pbxVar = (pbx) this.a;
                Network network = pbxVar.f;
                int rssi = Integer.MIN_VALUE;
                if (network != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) pbxVar.b.getSystemService("connectivity");
                    if (Build.VERSION.SDK_INT >= 29 && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null && (wifiInfo = (WifiInfo) networkCapabilities.getTransportInfo()) != null) {
                        rssi = wifiInfo.getRssi();
                    }
                }
                return Integer.valueOf(rssi);
            case 12:
                return (PowerManager.WakeLock) this.a.gu();
            case 13:
                pgr pgrVar = (pgr) this.a;
                return Boolean.valueOf(pgrVar.aa(pgrVar.r));
            case 14:
                pgr pgrVar2 = (pgr) this.a;
                return Boolean.valueOf(pgrVar2.aa(pgrVar2.r));
            case 15:
                return (PowerManager.WakeLock) this.a.gu();
            case 16:
                return (ExecutorService) this.a.gu();
            case 17:
                return (ozf) this.a.gu();
            default:
                return (BluetoothAdapter) this.a.gu();
        }
    }
}
