package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.media.MediaPlaybackManager;
import androidx.car.app.media.model.MediaPlaybackTemplate;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.carstream.tech.R;
import com.carstream.tech.media.ControllerService;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class s3 extends Screen implements DefaultLifecycleObserver {
    public MediaBrowserCompat a;
    public MediaControllerCompat b;
    public final Set c;
    public final o3 d;
    public final p3 e;
    public long f;
    public ControllerService g;
    public boolean h;
    public final q3 i;
    public boolean j;
    public boolean k;
    public int l;
    public final Handler m;
    public final p3 n;
    public String o;

    public s3(CarContext carContext, Set set) {
        super(carContext);
        this.d = new o3(this);
        this.e = new p3(this, 0);
        this.i = new q3(this);
        this.m = new Handler(Looper.getMainLooper());
        this.n = new p3(this, 1);
        this.o = "";
        this.c = set == null ? Collections.EMPTY_SET : set;
        getLifecycle().addObserver(this);
    }

    public static void c(s3 s3Var, int i) {
        MediaControllerCompat mediaControllerCompat = s3Var.b;
        if (mediaControllerCompat == null) {
            return;
        }
        MediaControllerCompat.TransportControls transportControls = mediaControllerCompat.getTransportControls();
        if (i == 0) {
            transportControls.skipToPrevious();
            return;
        }
        if (i == 1) {
            transportControls.play();
        } else if (i == 2) {
            transportControls.pause();
        } else {
            if (i != 3) {
                return;
            }
            transportControls.skipToNext();
        }
    }

    public static String j(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 1000;
        return (j2 / 60) + ":" + String.format(Locale.US, "%02d", Long.valueOf(j2 % 60));
    }

    public final void d() {
        if (this.h || this.k) {
            return;
        }
        try {
            this.h = getCarContext().bindService(new Intent(getCarContext(), (Class<?>) ControllerService.class).setAction(ControllerService.ACTION_UI), this.i, 1);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public final void e(String str) {
        if (this.k || this.j) {
            return;
        }
        int i = this.l + 1;
        this.l = i;
        this.o = str + " (luot " + i + ")";
        int i2 = this.l;
        if (i2 > 3) {
            int i3 = i2 % 10;
        }
        Handler handler = this.m;
        p3 p3Var = this.n;
        handler.removeCallbacks(p3Var);
        handler.postDelayed(p3Var, 2000L);
    }

    public final Action f(int i, int i2) {
        return new Action.Builder().setIcon(new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), i)).build()).setOnClickListener(new r3(this, i2, 1)).build();
    }

    public final boolean g(Class cls) {
        Set set = this.c;
        return set.isEmpty() || set.contains(cls);
    }

    public final void h() {
        MediaBrowserCompat mediaBrowserCompat;
        ControllerService controllerService;
        if (this.k || this.j) {
            return;
        }
        ControllerService controllerService2 = z6.a;
        MediaSessionCompat.Token sessionToken = controllerService2 == null ? null : controllerService2.getSessionToken();
        if (sessionToken == null && (controllerService = this.g) != null) {
            sessionToken = controllerService.tokenCuaPhien();
        }
        if (sessionToken == null && (mediaBrowserCompat = this.a) != null && mediaBrowserCompat.isConnected()) {
            sessionToken = this.a.getSessionToken();
        }
        if (sessionToken == null) {
            d();
            MediaBrowserCompat mediaBrowserCompat2 = this.a;
            if (mediaBrowserCompat2 == null) {
                onCreate(this);
            } else if (!mediaBrowserCompat2.isConnected()) {
                try {
                    this.a.connect();
                } catch (Throwable unused) {
                }
            }
            e("chua co token");
            return;
        }
        try {
            ((MediaPlaybackManager) getCarContext().getCarService(MediaPlaybackManager.class)).registerMediaPlaybackToken(sessionToken);
            this.j = true;
            ControllerService controllerService3 = z6.a;
            if (controllerService3 != null) {
                controllerService3.danhThucPhien();
            }
            k();
        } catch (Throwable th) {
            e("dang ky hong - ".concat(String.valueOf(th)));
        }
    }

    public final GridItem i(int i, int i2, String str) {
        return new GridItem.Builder().setTitle(str).setImage(new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), i)).build()).setOnClickListener(new r3(this, i2, 0)).build();
    }

    public final void k() {
        try {
            if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                invalidate();
            }
        } catch (Throwable unused) {
        }
    }

    public final Template l() {
        CharSequence text;
        CharSequence text2;
        MediaControllerCompat mediaControllerCompat = this.b;
        CarIcon carIconBuild = null;
        MediaMetadataCompat metadata = mediaControllerCompat == null ? null : mediaControllerCompat.getMetadata();
        MediaControllerCompat mediaControllerCompat2 = this.b;
        PlaybackStateCompat playbackState = mediaControllerCompat2 == null ? null : mediaControllerCompat2.getPlaybackState();
        boolean z = playbackState != null && playbackState.getState() == 3;
        String str = "";
        String string = (metadata == null || (text = metadata.getText(MediaMetadataCompat.METADATA_KEY_TITLE)) == null) ? "" : text.toString();
        if (string.isEmpty()) {
            string = "Chưa phát gì";
        }
        String string2 = (metadata == null || (text2 = metadata.getText(MediaMetadataCompat.METADATA_KEY_ARTIST)) == null) ? "" : text2.toString();
        if (metadata != null && playbackState != null) {
            long j = metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (j > 0) {
                str = j(playbackState.getPosition()) + " / " + j(j);
            }
        }
        if (!str.isEmpty()) {
            if (string2.isEmpty()) {
                string2 = str;
            } else {
                string2 = string2 + " · " + str;
            }
        }
        if (string2.isEmpty()) {
            string2 = "Mở CarStream trên màn hình xe";
        }
        Row.Builder builderAddText = new Row.Builder().setTitle(string).addText(string2);
        if (metadata != null) {
            Bitmap bitmap = metadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
            if (bitmap == null) {
                bitmap = metadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ART);
            }
            if (bitmap != null) {
                try {
                    carIconBuild = new CarIcon.Builder(IconCompat.createWithBitmap(bitmap)).build();
                } catch (Exception unused) {
                }
            }
        }
        if (carIconBuild != null) {
            builderAddText.setImage(carIconBuild, 2);
        }
        boolean zG = g(PaneTemplate.class);
        int i = R.drawable.ic_play;
        if (zG) {
            Pane paneBuild = new Pane.Builder().addRow(builderAddText.build()).addAction(f(R.drawable.ic_skip_prev, 0)).addAction(f(R.drawable.ic_skip_next, 3)).build();
            ActionStrip.Builder builder = new ActionStrip.Builder();
            if (z) {
                i = R.drawable.ic_pause;
            }
            return new PaneTemplate.Builder(paneBuild).setTitle(getCarContext().getString(R.string.control_name)).setHeaderAction(Action.APP_ICON).setActionStrip(builder.addAction(f(i, z ? 2 : 1)).build()).build();
        }
        if (!g(GridTemplate.class)) {
            return new MessageTemplate.Builder(string + "\n" + string2).setTitle(getCarContext().getString(R.string.control_name)).setHeaderAction(Action.APP_ICON).build();
        }
        ItemList.Builder builder2 = new ItemList.Builder();
        builder2.addItem(i(R.drawable.ic_skip_prev, 0, "Trước"));
        String str2 = z ? "Dừng" : "Phát";
        if (z) {
            i = R.drawable.ic_pause;
        }
        builder2.addItem(i(i, z ? 2 : 1, str2));
        builder2.addItem(i(R.drawable.ic_skip_next, 3, "Sau"));
        return new GridTemplate.Builder().setTitle(string).setHeaderAction(Action.APP_ICON).setSingleList(builder2.build()).build();
    }

    public final Template m() {
        if (this.j) {
            ControllerService controllerService = z6.a;
            if (controllerService != null) {
                controllerService.danhThucNhe();
            }
            return new MediaPlaybackTemplate.Builder().build();
        }
        if (this.l >= 6) {
            return l();
        }
        String string = getCarContext().getString(R.string.control_connecting);
        if (!this.o.isEmpty()) {
            string = string + "\n" + this.o;
        }
        return new MessageTemplate.Builder(string).setTitle(getCarContext().getString(R.string.control_name)).setHeaderAction(Action.APP_ICON).build();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(getCarContext(), new ComponentName(getCarContext(), (Class<?>) ControllerService.class), new n3(this), null);
        this.a = mediaBrowserCompat;
        mediaBrowserCompat.connect();
        d();
        h();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        MediaControllerCompat mediaControllerCompat = this.b;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.d);
            this.b = null;
        }
        MediaBrowserCompat mediaBrowserCompat = this.a;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.disconnect();
            this.a = null;
        }
        if (this.h) {
            try {
                getCarContext().unbindService(this.i);
            } catch (Throwable unused) {
            }
            this.h = false;
        }
        this.g = null;
        this.k = true;
        this.j = false;
        this.m.removeCallbacksAndMessages(null);
    }

    @Override // androidx.car.app.Screen
    public final Template onGetTemplate() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f > 1000) {
            this.f = jElapsedRealtime;
        }
        if (g(MediaPlaybackTemplate.class)) {
            try {
                return m();
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        this.c.size();
        try {
            return l();
        } catch (Throwable th2) {
            String.valueOf(th2);
            return new MessageTemplate.Builder("Không dựng được màn điều khiển").setTitle(getCarContext().getString(R.string.control_name)).setHeaderAction(Action.APP_ICON).build();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (!this.j) {
            this.l = 0;
            h();
        }
        try {
            invalidate();
        } catch (Throwable unused) {
        }
    }
}
