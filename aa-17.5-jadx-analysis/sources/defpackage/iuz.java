package defpackage;

/* loaded from: classes.dex */
public final class iuz implements iuy {
    public static final yfy c;
    public final xkj d;
    public final jew e;
    public final jes f;
    public final ikz g;
    public static final yph a = yph.c("GH.CAR.VIDEO");
    public static final yfq b = yfq.q(new String[]{"Subaru", "", "", "", "HARMAN"});
    private static final ygr h = ygr.q(xkj.MEDIA_CODEC_VIDEO_H264_BP, xkj.MEDIA_CODEC_VIDEO_H265, xkj.MEDIA_CODEC_VIDEO_AV1);

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e("480p", new ymp(xpc.VIDEO_800x480));
        yfuVar.e("720p", ygr.q(xpc.VIDEO_800x480, xpc.VIDEO_720x1280, xpc.VIDEO_1280x720));
        yfuVar.e("1080p", ygr.s(xpc.VIDEO_800x480, xpc.VIDEO_720x1280, xpc.VIDEO_1280x720, xpc.VIDEO_1080x1920, xpc.VIDEO_1920x1080));
        yfuVar.e("1440p", ygr.t(xpc.VIDEO_800x480, xpc.VIDEO_720x1280, xpc.VIDEO_1280x720, xpc.VIDEO_1080x1920, xpc.VIDEO_1920x1080, xpc.VIDEO_1440x2560, xpc.VIDEO_2560x1440));
        yfuVar.e("2160p", ygr.t(xpc.VIDEO_800x480, xpc.VIDEO_720x1280, xpc.VIDEO_1280x720, xpc.VIDEO_1080x1920, xpc.VIDEO_1920x1080, xpc.VIDEO_1440x2560, xpc.VIDEO_2560x1440, xpc.VIDEO_2160x3840, xpc.VIDEO_3840x2160));
        c = yfuVar.d(true);
    }

    public iuz(xkj xkjVar, jew jewVar, jes jesVar, ikz ikzVar) {
        woy.S(h.contains(xkjVar), "videoCodecType %s must be supported.", xkjVar);
        this.d = xkjVar;
        this.e = jewVar;
        this.f = jesVar;
        this.g = ikzVar;
    }
}
