package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.C0395s;
import G6.U;
import Va.C1038ka;
import Va.M6;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;
import za.C4658a;

/* loaded from: classes3.dex */
public final class zzcgy extends zzcha implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzchu zzd;
    private final zzchv zze;
    private final boolean zzf;
    private final zzdzt zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzchs zzo;
    private final boolean zzp;
    private int zzq;
    private zzcgz zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgy(Context context, zzchu zzchuVar, boolean z2, boolean z10, zzcht zzchtVar, zzchv zzchvVar, zzdzt zzdztVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzchuVar;
        this.zze = zzchvVar;
        this.zzp = z2;
        this.zzf = z10;
        zzchvVar.zza(this);
        this.zzg = zzdztVar;
    }

    private final void zzD() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        zzdzt zzdztVar;
        G6.L.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            C6.n nVar = C6.n.f1857D;
            C4658a c4658a = nVar.f1880u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoW)).booleanValue() && (zzdztVar = this.zzg) != null) {
                    zzdzs zzdzsVarZza = zzdztVar.zza();
                    zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "svp_ampv");
                    zzdzsVarZza.zzd();
                }
                zzchs zzchsVar = new zzchs(getContext());
                this.zzo = zzchsVar;
                zzchsVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzchs zzchsVar2 = this.zzo;
                zzchsVar2.start();
                SurfaceTexture surfaceTextureZze = zzchsVar2.zze();
                if (surfaceTextureZze != null) {
                    surfaceTexture = surfaceTextureZze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            C1038ka c1038ka = nVar.f1881v;
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException e7) {
            e = e7;
            H6.l.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalArgumentException e10) {
            e = e10;
            H6.l.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e11) {
            e = e11;
            H6.l.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z2) {
        G6.L.k("AdMediaPlayerView release");
        zzchs zzchsVar = this.zzo;
        if (zzchsVar != null) {
            zzchsVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z2) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i5;
        return (this.zzj == null || (i5 = this.zzh) == -1 || i5 == 0 || i5 == 1) ? false : true;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i5) {
        if (i5 == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i5;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i5) {
        this.zzn = i5;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        G6.L.k("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        U.f4562l.post(new zzcgq(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i5, int i10) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i5));
        String str2 = (String) map.get(Integer.valueOf(i10));
        String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2);
        int i11 = G6.L.f4523b;
        H6.l.f(strH);
        zzH(-1);
        this.zzi = -1;
        U.f4562l.post(new zzcgr(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i5, int i10) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i5));
        String str2 = (String) map.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(str2);
        G6.L.k(sb2.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzl
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.zzm
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.zzl
            if (r2 <= 0) goto L7a
            int r2 = r5.zzm
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zzchs r2 = r5.zzo
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.zzl
            int r1 = r0 * r7
            int r2 = r5.zzm
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.zzm
            int r0 = r0 * r6
            int r2 = r5.zzl
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.zzl
            int r1 = r1 * r7
            int r2 = r5.zzm
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.zzl
            int r4 = r5.zzm
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzchs r6 = r5.zzo
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgy.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        G6.L.k("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        U.f4562l.post(new zzcgp(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i5 = this.zzq;
        if (i5 != 0) {
            zzi(i5);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            G6.L.k("AdMediaPlayerView nudging MediaPlayer");
            zzG(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition) {
                C6.n.f1857D.k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.zzj.pause();
            zzq();
        }
        int i10 = this.zzl;
        int i11 = this.zzm;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        H6.l.e(sb2.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        G6.L.k("AdMediaPlayerView surface created");
        zzD();
        U.f4562l.post(new zzcgs(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        G6.L.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzchs zzchsVar = this.zzo;
        if (zzchsVar != null) {
            zzchsVar.zzd();
        }
        U.f4562l.post(new zzcgu(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i10) throws IllegalStateException {
        G6.L.k("AdMediaPlayerView surface changed");
        int i11 = this.zzi;
        boolean z2 = false;
        if (this.zzl == i5 && this.zzm == i10) {
            z2 = true;
        }
        if (this.zzj != null && i11 == 3 && z2) {
            int i12 = this.zzq;
            if (i12 != 0) {
                zzi(i12);
            }
            zze();
        }
        zzchs zzchsVar = this.zzo;
        if (zzchsVar != null) {
            zzchsVar.zzc(i5, i10);
        }
        U.f4562l.post(new zzcgt(this, i5, i10));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i5, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 35 + String.valueOf(i10).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i5);
        sb2.append(" x ");
        sb2.append(i10);
        G6.L.k(sb2.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(i5);
            }
        });
        super.onWindowVisibilityChanged(i5);
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcgy.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return M6.t(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzb(zzcgz zzcgzVar) {
        this.zzr = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzc(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        zzbhi zzbhiVarZza = zzbhi.zza(uri);
        if (zzbhiVarZza == null || zzbhiVarZza.zza != null) {
            if (zzbhiVarZza != null) {
                uri = Uri.parse(zzbhiVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzd() throws IllegalStateException {
        G6.L.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zze() throws IllegalStateException {
        G6.L.k("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            U.f4562l.post(new zzcgv(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzf() throws IllegalStateException {
        G6.L.k("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            U.f4562l.post(new zzcgw(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzi(int i5) throws IllegalStateException {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
        if (!zzF()) {
            this.zzq = i5;
        } else {
            this.zzj.seekTo(i5);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzj(float f10, float f11) {
        zzchs zzchsVar = this.zzo;
        if (zzchsVar != null) {
            zzchsVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * this.zzn) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzo() {
        if (this.zzt != null) {
            return zzg() * this.zzt.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcha, com.google.android.gms.internal.ads.zzchx
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    public final /* synthetic */ void zzr(int i5) {
        zzcgz zzcgzVar = this.zzr;
        if (zzcgzVar != null) {
            zzcgzVar.onWindowVisibilityChanged(i5);
        }
    }

    public final void zzs(MediaPlayer mediaPlayer) throws IllegalStateException {
        MediaFormat format;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(integer, 1) + String.valueOf(integer2).length());
                                    sb2.append(integer);
                                    sb2.append("x");
                                    sb2.append(integer2);
                                    map.put("resolution", sb2.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", map);
            }
        } catch (RuntimeException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdMediaPlayerView.reportMetadata");
        }
    }

    public final /* synthetic */ zzcgz zzt() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    public final /* synthetic */ void zzv(boolean z2) {
        this.zzs = true;
    }
}
