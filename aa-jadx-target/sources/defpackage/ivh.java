package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivh implements defpackage.ivg {
    public static final defpackage.yhe c;
    public final defpackage.xlk d;
    public final defpackage.jfe e;
    public final defpackage.jfa f;
    public final defpackage.ilj g;
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CAR.VIDEO");
    public static final defpackage.ygw b = defpackage.ygw.q(new java.lang.String[]{"Subaru", "", "", "", "HARMAN"});
    private static final defpackage.yhx h = defpackage.yhx.q(defpackage.xlk.MEDIA_CODEC_VIDEO_H264_BP, defpackage.xlk.MEDIA_CODEC_VIDEO_H265, defpackage.xlk.MEDIA_CODEC_VIDEO_AV1);

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f("480p", new defpackage.ynu(defpackage.xqd.VIDEO_800x480));
        yhaVar.f("720p", defpackage.yhx.q(defpackage.xqd.VIDEO_800x480, defpackage.xqd.VIDEO_720x1280, defpackage.xqd.VIDEO_1280x720));
        yhaVar.f("1080p", defpackage.yhx.s(defpackage.xqd.VIDEO_800x480, defpackage.xqd.VIDEO_720x1280, defpackage.xqd.VIDEO_1280x720, defpackage.xqd.VIDEO_1080x1920, defpackage.xqd.VIDEO_1920x1080));
        yhaVar.f("1440p", defpackage.yhx.t(defpackage.xqd.VIDEO_800x480, defpackage.xqd.VIDEO_720x1280, defpackage.xqd.VIDEO_1280x720, defpackage.xqd.VIDEO_1080x1920, defpackage.xqd.VIDEO_1920x1080, defpackage.xqd.VIDEO_1440x2560, defpackage.xqd.VIDEO_2560x1440));
        yhaVar.f("2160p", defpackage.yhx.t(defpackage.xqd.VIDEO_800x480, defpackage.xqd.VIDEO_720x1280, defpackage.xqd.VIDEO_1280x720, defpackage.xqd.VIDEO_1080x1920, defpackage.xqd.VIDEO_1920x1080, defpackage.xqd.VIDEO_1440x2560, defpackage.xqd.VIDEO_2560x1440, defpackage.xqd.VIDEO_2160x3840, defpackage.xqd.VIDEO_3840x2160));
        c = yhaVar.d(true);
    }

    public ivh(defpackage.xlk xlkVar, defpackage.jfe jfeVar, defpackage.jfa jfaVar, defpackage.ilj iljVar) {
        defpackage.ysr.bc(h.contains(xlkVar), "videoCodecType %s must be supported.", xlkVar);
        this.d = xlkVar;
        this.e = jfeVar;
        this.f = jfaVar;
        this.g = iljVar;
    }
}
