package androidx.webkit.internal;

import androidx.media3.common.MimeTypes;
import com.waze.strings.DisplayStrings;
import java.net.URLConnection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class MimeUtil {
    private MimeUtil() {
    }

    public static String getMimeFromFileName(String str) {
        if (str == null) {
            return null;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName != null ? strGuessContentTypeFromName : guessHardcodedMime(str);
    }

    private static String guessHardcodedMime(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
        switch (lowerCase.hashCode()) {
            case DisplayStrings.DS_DESTINATION_CELL_UNVERIFIED_CALENDAR_EVENT_SUBTITLE /* 3315 */:
                if (lowerCase.equals("gz")) {
                    return "application/gzip";
                }
                return null;
            case DisplayStrings.DS_EV_PLUG_CHADEMO_SETTINGS /* 3401 */:
                if (lowerCase.equals("js")) {
                    return "text/javascript";
                }
                return null;
            case 97669:
                if (lowerCase.equals("bmp")) {
                    return MimeTypes.IMAGE_BMP;
                }
                return null;
            case 98819:
                if (lowerCase.equals("css")) {
                    return "text/css";
                }
                return null;
            case 102340:
                if (lowerCase.equals("gif")) {
                    return "image/gif";
                }
                return null;
            case 103649:
                if (lowerCase.equals("htm")) {
                    return "text/html";
                }
                return null;
            case 104085:
                if (lowerCase.equals("ico")) {
                    return "image/x-icon";
                }
                return null;
            case 105441:
                if (lowerCase.equals("jpg")) {
                    return MimeTypes.IMAGE_JPEG;
                }
                return null;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/x-m4a";
                }
                return null;
            case 106479:
                if (lowerCase.equals("m4v")) {
                    return MimeTypes.VIDEO_MP4;
                }
                return null;
            case 108089:
                if (lowerCase.equals("mht")) {
                    return "multipart/related";
                }
                return null;
            case 108150:
                if (lowerCase.equals("mjs")) {
                    return "text/javascript";
                }
                return null;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return MimeTypes.AUDIO_MPEG;
                }
                return null;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return MimeTypes.VIDEO_MP4;
                }
                return null;
            case 108324:
                if (lowerCase.equals("mpg")) {
                    return MimeTypes.VIDEO_MPEG;
                }
                return null;
            case 109961:
                if (lowerCase.equals("oga")) {
                    return MimeTypes.AUDIO_OGG;
                }
                return null;
            case 109967:
                if (lowerCase.equals("ogg")) {
                    return MimeTypes.AUDIO_OGG;
                }
                return null;
            case 109973:
                if (lowerCase.equals("ogm")) {
                    return MimeTypes.VIDEO_OGG;
                }
                return null;
            case 109982:
                if (lowerCase.equals("ogv")) {
                    return MimeTypes.VIDEO_OGG;
                }
                return null;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                return null;
            case 111030:
                if (lowerCase.equals("pjp")) {
                    return MimeTypes.IMAGE_JPEG;
                }
                return null;
            case 111145:
                if (lowerCase.equals("png")) {
                    return MimeTypes.IMAGE_PNG;
                }
                return null;
            case 114276:
                if (lowerCase.equals("svg")) {
                    return "image/svg+xml";
                }
                return null;
            case 114791:
                if (lowerCase.equals("tgz")) {
                    return "application/gzip";
                }
                return null;
            case 114833:
                if (lowerCase.equals("tif")) {
                    return "image/tiff";
                }
                return null;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return MimeTypes.AUDIO_WAV;
                }
                return null;
            case 118660:
                if (lowerCase.equals("xht")) {
                    return "application/xhtml+xml";
                }
                return null;
            case 118807:
                if (lowerCase.equals("xml")) {
                    return "text/xml";
                }
                return null;
            case 120609:
                if (lowerCase.equals("zip")) {
                    return "application/zip";
                }
                return null;
            case 3000872:
                if (lowerCase.equals("apng")) {
                    return "image/apng";
                }
                return null;
            case 3145576:
                if (lowerCase.equals("flac")) {
                    return MimeTypes.AUDIO_FLAC;
                }
                return null;
            case 3213227:
                if (lowerCase.equals("html")) {
                    return "text/html";
                }
                return null;
            case 3259225:
                if (lowerCase.equals("jfif")) {
                    return MimeTypes.IMAGE_JPEG;
                }
                return null;
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                    return MimeTypes.IMAGE_JPEG;
                }
                return null;
            case 3271912:
                if (lowerCase.equals("json")) {
                    return "application/json";
                }
                return null;
            case 3358085:
                if (lowerCase.equals("mpeg")) {
                    return MimeTypes.VIDEO_MPEG;
                }
                return null;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return MimeTypes.AUDIO_OGG;
                }
                return null;
            case 3529614:
                if (lowerCase.equals("shtm")) {
                    return "text/html";
                }
                return null;
            case 3542678:
                if (lowerCase.equals("svgz")) {
                    return "image/svg+xml";
                }
                return null;
            case 3559925:
                if (lowerCase.equals("tiff")) {
                    return "image/tiff";
                }
                return null;
            case 3642020:
                if (lowerCase.equals("wasm")) {
                    return "application/wasm";
                }
                return null;
            case 3645337:
                if (lowerCase.equals("webm")) {
                    return MimeTypes.VIDEO_WEBM;
                }
                return null;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    return MimeTypes.IMAGE_WEBP;
                }
                return null;
            case 3655064:
                if (lowerCase.equals("woff")) {
                    return "application/font-woff";
                }
                return null;
            case 3678569:
                if (lowerCase.equals("xhtm")) {
                    return "application/xhtml+xml";
                }
                return null;
            case 96488848:
                if (lowerCase.equals("ehtml")) {
                    return "text/html";
                }
                return null;
            case 103877016:
                if (lowerCase.equals("mhtml")) {
                    return "multipart/related";
                }
                return null;
            case 106703064:
                if (lowerCase.equals("pjpeg")) {
                    return MimeTypes.IMAGE_JPEG;
                }
                return null;
            case 109418142:
                if (lowerCase.equals("shtml")) {
                    return "text/html";
                }
                return null;
            case 114035747:
                if (lowerCase.equals("xhtml")) {
                    return "application/xhtml+xml";
                }
                return null;
            default:
                return null;
        }
    }
}
