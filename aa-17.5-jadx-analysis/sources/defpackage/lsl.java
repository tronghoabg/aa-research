package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* loaded from: classes2.dex */
final class lsl extends lsd {
    private final AaPlaybackState c;

    public lsl(ComponentName componentName, AaPlaybackState aaPlaybackState) {
        super(componentName);
        this.c = aaPlaybackState;
    }

    @Override // defpackage.lsd
    protected final String a() {
        String strBn;
        StringBuilder sb = new StringBuilder("PLAYBACK_STATE ");
        AaPlaybackState aaPlaybackState = this.c;
        sb.append(lkb.a(aaPlaybackState));
        if (aaPlaybackState != null) {
            sb.append(" position=");
            sb.append(aaPlaybackState.U());
            sb.append(" queue_id=");
            sb.append(aaPlaybackState.S());
            sb.append(" standard_actions=[");
            sb.append((String) Collection.EL.stream(((ylx) lkb.a).keySet()).filter(new ljz(aaPlaybackState.R(), 0)).map(new lka(0)).collect(Collectors.joining(",")));
            sb.append("] custom_actions=[");
            sb.append((String) Collection.EL.stream(aaPlaybackState.V()).map(new lka(1)).collect(Collectors.joining(",")));
            sb.append("]");
            if (aaPlaybackState.P() != 0) {
                sb.append(" error_code=");
                int iP = aaPlaybackState.P();
                switch (iP) {
                    case 0:
                        strBn = "UNKNOWN_ERROR";
                        break;
                    case 1:
                        strBn = "APP_ERROR";
                        break;
                    case 2:
                        strBn = "NOT_SUPPORTED";
                        break;
                    case 3:
                        strBn = "AUTHENTICATION_EXPIRED";
                        break;
                    case 4:
                        strBn = "PREMIUM_ACCOUNT_REQUIRED";
                        break;
                    case 5:
                        strBn = "CONCURRENT_STREAM_LIMIT";
                        break;
                    case 6:
                        strBn = "PARENTAL_CONTROL_RESTRICTED";
                        break;
                    case 7:
                        strBn = "NOT_AVAILABLE_IN_REGION";
                        break;
                    case 8:
                        strBn = "CONTENT_ALREADY_PLAYING";
                        break;
                    case 9:
                        strBn = "SKIP_LIMIT_REACHED";
                        break;
                    case 10:
                        strBn = "ACTION_ABORTED";
                        break;
                    case 11:
                        strBn = "END_OF_QUEUE";
                        break;
                    default:
                        strBn = a.bn(iP, "OTHER(", ")");
                        break;
                }
                sb.append(strBn);
            }
            if (!TextUtils.isEmpty(aaPlaybackState.W())) {
                sb.append(" error_message=");
                sb.append(aaPlaybackState.W());
            }
        }
        return sb.toString();
    }
}
