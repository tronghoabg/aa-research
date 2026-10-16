package com.carstream.tech.media;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.utils.MediaConstants;
import com.carstream.tech.R;
import com.carstream.tech.phone.MainActivity;
import defpackage.c1;
import defpackage.d1;
import defpackage.dd;
import defpackage.e1;
import defpackage.i2;
import defpackage.l0;
import defpackage.v7;
import defpackage.w3;
import defpackage.w6;
import defpackage.w7;
import defpackage.x3;
import defpackage.xc;
import defpackage.y6;
import defpackage.z6;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ControllerService extends MediaBrowserServiceCompat {
    public static final String ACTION_UI = "com.carstream.tech.action.MEDIA_SERVICE_UI";
    private static final int ART_PX = 256;
    private static final String CA_GIONG_NOI = "cnt.giong_noi";
    private static final String CA_MO_APP = "cnt.mo_app.";
    private static final String CA_TOAN_MAN = "cnt.toan_man_hinh";
    private static final String CA_TUA_LUI = "cnt.tua_lui";
    private static final String CA_TUA_TOI = "cnt.tua_toi";
    private static final long DOUBLE_TAP_MS = 600;
    public static final String EXTRA_SCREEN = "com.carstream.tech.SCREEN";
    private static final String ROOT_ID = "root";
    private static final String SEARCH_ID = "search/";
    private static final long SEEK_STEP_MS = 10000;
    private Bitmap artBitmap;
    private Bitmap iconBitmap;
    private int iconRes;
    private long lastNextAt;
    private Runnable pendingSkip;
    private MediaSessionCompat session;
    private final Handler main = new Handler(Looper.getMainLooper());
    private int lastNavLimit = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    private final v7 navListener = new i2(this, 1);
    private final x3 cuaRieng = new x3(this);
    private int artLimit = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    private final e1 shadeArt = new e1();
    private final d1 onArtReady = new c1(this, 3);
    private final MediaSessionCompat.Callback callback = new w3(this);

    private Bitmap appIcon() {
        Bitmap bitmap;
        w6 w6VarL = z6.l();
        int i = w6VarL == null ? 0 : w6VarL.o;
        if (i == 0) {
            return null;
        }
        if (i == this.iconRes && (bitmap = this.iconBitmap) != null) {
            return bitmap;
        }
        this.iconRes = i;
        Bitmap bitmapRenderSquare = renderSquare(i);
        this.iconBitmap = bitmapRenderSquare;
        return bitmapRenderSquare;
    }

    private String artistLine() {
        w6 w6VarL = z6.l();
        String str = w6VarL == null ? "" : w6VarL.n;
        return str.isEmpty() ? "CarStream" : str;
    }

    private String coChu(String str) {
        return (str == null || str.isEmpty()) ? "Chưa phát gì" : str;
    }

    private void datAnhBia(MediaMetadataCompat.Builder builder, int i) throws Resources.NotFoundException {
        if (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("gaugeOnlyArt"), false)) {
            Bitmap bitmapLimitArt = limitArt(i);
            String strTaiNguyenUri = taiNguyenUri(xc.q(i));
            if (bitmapLimitArt != null && strTaiNguyenUri != null) {
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmapLimitArt);
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmapLimitArt);
                builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, strTaiNguyenUri);
                builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, strTaiNguyenUri);
                return;
            }
        }
        String strX = z6.x();
        if (strX == null || !strX.startsWith("http")) {
            w6 w6VarL = z6.l();
            String strTaiNguyenUri2 = taiNguyenUri(w6VarL != null ? w6VarL.o : 0);
            builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, strTaiNguyenUri2);
            builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, strTaiNguyenUri2);
            Bitmap bitmapAppIcon = appIcon();
            if (bitmapAppIcon != null) {
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmapAppIcon);
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmapAppIcon);
                return;
            }
            return;
        }
        builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, strX);
        builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, strX);
        e1 e1Var = this.shadeArt;
        Bitmap bitmap = (e1Var.c == null || !strX.equals(e1Var.b)) ? null : e1Var.c;
        if (bitmap == null) {
            this.shadeArt.a(strX, this.onArtReady);
        } else {
            builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
            builder.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
        }
    }

    private static dd firstSearchable() {
        for (dd ddVar : l0.a) {
            if (ddVar.e != null) {
                return ddVar;
            }
        }
        return null;
    }

    private Bitmap limitArt(int i) {
        if (i == this.artLimit) {
            return this.artBitmap;
        }
        this.artLimit = i;
        this.artBitmap = null;
        int iQ = xc.q(i);
        if (iQ == 0) {
            return null;
        }
        Bitmap bitmapRenderSquare = renderSquare(iQ);
        this.artBitmap = bitmapRenderSquare;
        return bitmapRenderSquare;
    }

    private static PlaybackStateCompat.CustomAction nutPhu(String str, String str2, int i) {
        return new PlaybackStateCompat.CustomAction.Builder(str, str2, i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y6 playerOrLog(String str) {
        y6 y6VarN = z6.n();
        if (y6VarN == null) {
            return y6VarN;
        }
        z6.f();
        return y6VarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishNotReady() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat == null) {
            return;
        }
        try {
            mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setActions(2564L).setState(7, 0L, 0.0f).setErrorMessage(10, "Hãy mở CarStream trên màn hình xe trước").setExtras(screenExtras()).build());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String queryFrom(String str, Bundle bundle) {
        if (str != null && !str.trim().isEmpty()) {
            return str.trim();
        }
        if (bundle == null) {
            return "";
        }
        String[] strArr = {"android.intent.extra.title", "android.intent.extra.artist", "android.intent.extra.album", "android.intent.extra.playlist", "android.intent.extra.genre"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            String string = bundle.getString(strArr[i]);
            if (string != null && !string.trim().isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(string.trim());
            }
        }
        return sb.toString();
    }

    private Bitmap renderSquare(int i) {
        try {
            Drawable drawable = getDrawable(i);
            if (drawable == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            drawable.setFilterBitmap(true);
            drawable.setBounds(0, 0, 256, 256);
            drawable.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            String.valueOf(th);
            return null;
        }
    }

    private Bundle screenExtras() {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_SCREEN, z6.q(z6.e()));
        return bundle;
    }

    private String taiNguyenUri(int i) throws Resources.NotFoundException {
        if (i == 0) {
            return null;
        }
        try {
            Resources resources = getResources();
            return "android.resource://" + getPackageName() + "/" + resources.getResourceTypeName(i) + "/" + resources.getResourceEntryName(i);
        } catch (Exception e) {
            String.valueOf(e);
            return null;
        }
    }

    private static PlaybackStateCompat.Builder themNutPhu(PlaybackStateCompat.Builder builder) {
        return builder.addCustomAction(nutPhu(CA_GIONG_NOI, "Tìm kiếm", R.drawable.ic_search)).addCustomAction(nutPhu(CA_TUA_TOI, "Tua tới 10 giây", R.drawable.ic_nav_forward));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean theoGioiHan() {
        return getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("limitAsTitle"), false) || getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("gaugeOnlyArt"), false);
    }

    private String tieuDeGui(int i) {
        if (!getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("limitAsTitle"), false)) {
            return coChu(z6.m());
        }
        String strI = xc.i(this, i);
        return strI == null ? coChu(z6.m()) : strI;
    }

    public void danhThucNhe() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat == null) {
            return;
        }
        try {
            mediaSessionCompat.setActive(true);
            if (this.session.getController() == null || this.session.getController().getMetadata() != null) {
                return;
            }
            publishNowPlaying();
        } catch (Throwable unused) {
        }
    }

    public void danhThucPhien() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat == null) {
            return;
        }
        try {
            mediaSessionCompat.setActive(true);
            publishNowPlaying();
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public IBinder onBind(Intent intent) {
        return (intent == null || !ACTION_UI.equals(intent.getAction())) ? super.onBind(intent) : this.cuaRieng;
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onCreate() {
        super.onCreate();
        w7.a(this.navListener);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "LuotPlay");
        this.session = mediaSessionCompat;
        mediaSessionCompat.setCallback(this.callback);
        this.session.setFlags(3);
        this.session.setRatingType(0);
        try {
            this.session.setSessionActivity(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 67108864));
        } catch (Exception unused) {
        }
        setSessionToken(this.session.getSessionToken());
        publishState(2);
        this.session.setActive(true);
        z6.a = this;
        PlaybackService.refresh();
    }

    @Override // android.app.Service
    public void onDestroy() {
        w7.l.remove(this.navListener);
        if (z6.a == this) {
            z6.a = null;
        }
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat != null) {
            try {
                mediaSessionCompat.setActive(false);
                this.session.release();
            } catch (Exception unused) {
            }
            this.session = null;
        }
        PlaybackService.refresh();
        super.onDestroy();
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public MediaBrowserServiceCompat.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(MediaConstants.BROWSER_SERVICE_EXTRAS_KEY_SEARCH_SUPPORTED, true);
        return new MediaBrowserServiceCompat.BrowserRoot(ROOT_ID, bundle2);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void onLoadChildren(String str, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.sendResult(new ArrayList());
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void onSearch(String str, Bundle bundle, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        ArrayList arrayList = new ArrayList();
        String strQueryFrom = queryFrom(str, bundle);
        dd ddVarFirstSearchable = firstSearchable();
        if (!strQueryFrom.isEmpty() && ddVarFirstSearchable != null) {
            arrayList.add(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat.Builder().setMediaId(SEARCH_ID.concat(strQueryFrom)).setTitle(strQueryFrom).setSubtitle("Tìm trên " + ddVarFirstSearchable.b).build(), 2));
        }
        result.sendResult(arrayList);
    }

    public void publishNowPlaying() {
        if (this.session == null) {
            return;
        }
        try {
            int iG = w7.g();
            String strTieuDeGui = tieuDeGui(iG);
            MediaMetadataCompat.Builder builderPutLong = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, strTieuDeGui).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, strTieuDeGui).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, artistLine()).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, artistLine()).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, z6.k());
            datAnhBia(builderPutLong, iG);
            this.session.setMetadata(builderPutLong.build());
        } catch (Exception unused) {
        }
        publishState(z6.b ? 3 : 2);
    }

    public void publishState(int i) {
        if (this.session == null) {
            return;
        }
        try {
            this.session.setPlaybackState(new PlaybackStateCompat.Builder().setActions(85887L).setState(i, z6.o(z6.l()), i == 3 ? 1.0f : 0.0f).setExtras(screenExtras()).build());
        } catch (Exception unused) {
        }
    }

    public void quitService() {
        try {
            MediaSessionCompat mediaSessionCompat = this.session;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(false);
            }
        } catch (Exception unused) {
        }
        stopSelf();
    }

    public MediaSessionCompat.Token tokenCuaPhien() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat == null) {
            return null;
        }
        return mediaSessionCompat.getSessionToken();
    }
}
