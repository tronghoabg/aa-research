package defpackage;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.personalcontext.insight.InsightDisplayDetails;
import android.util.Log;
import com.android.personalcontext.ace.client.prototype.clientaction.ClientActionParams;
import com.android.personalcontext.ace.client.prototype.clientaction.FullScreenRequestParams;
import com.android.personalcontext.ace.client.prototype.clientaction.ShareLiveLocationParams;
import com.android.personalcontext.ace.client.prototype.clientaction.SharePhotoParams;
import com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams;
import com.android.personalcontext.ace.client.prototype.clientaction.TextPasteParams;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hnt extends hnd {
    @Override // defpackage.hnd
    public final hne a(Bundle bundle, Set set) {
        hdg hogVar;
        Object objDE;
        hdg hodVar;
        Object next;
        hnz hnzVar;
        Bundle bundle2 = bundle.getBundle("CLIENT_ACTION_PARAMS_BUNDLE_KEY");
        if (bundle2 != null) {
            int i = bundle2.getInt("PARAM_ID");
            afao afaoVar = new afao((afar) hnv.i);
            while (true) {
                if (!afaoVar.hasNext()) {
                    next = null;
                    break;
                }
                next = afaoVar.next();
                if (((hnv) next).j == i) {
                    break;
                }
            }
            hnv hnvVar = (hnv) next;
            if (hnvVar == null) {
                hnvVar = hnv.a;
            }
            switch (hnvVar.ordinal()) {
                case 0:
                    hnzVar = hnx.a;
                    break;
                case 1:
                    hnzVar = hoe.a;
                    break;
                case 2:
                    hnzVar = hof.a;
                    break;
                case 3:
                    hnzVar = hob.a;
                    break;
                case 4:
                    hnzVar = hog.a;
                    break;
                case 5:
                    hnzVar = hod.a;
                    break;
                case 6:
                    hnzVar = hoc.a;
                    break;
                case 7:
                    hnzVar = hoa.a;
                    break;
                default:
                    throw new aezs();
            }
            hogVar = hnzVar.a(bundle2);
        } else {
            hogVar = null;
        }
        if (hogVar == null) {
            bundle.setClassLoader(ClientActionParams.class.getClassLoader());
            try {
                Object obj = bundle.get("CLIENT_ACTION_PARAMS_KEY");
                if (obj instanceof Bundle) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.setClassLoader(ClientActionParams.class.getClassLoader());
                    objDE = (ClientActionParams) bundle3.getParcelable("CLIENT_ACTION_PARAMS_KEY", ClientActionParams.class);
                } else {
                    objDE = obj instanceof ClientActionParams ? (ClientActionParams) obj : null;
                }
            } catch (Throwable th) {
                objDE = woy.dE(th);
            }
            if (objDE == null) {
                throw new IllegalArgumentException("bundle.get(CLIENT_ACTION_PARAMS_LEGACY_KEY) is null");
            }
            Throwable thA = aezw.a(objDE);
            if (thA != null) {
                Log.e("ClientActionInsight", "Failed to get Legacy ClientActionParams.", thA);
                objDE = null;
            }
            ClientActionParams clientActionParams = (ClientActionParams) objDE;
            if (clientActionParams == null) {
                Log.v("ClientActionInsight", "[parseParcelableParams] legacyClientActionParams is null");
                hogVar = null;
            } else {
                Log.i("ClientActionInsight", "[parseParcelableParams] Received legacy Parcelable params, converting to Bundle params.");
                if (clientActionParams instanceof SharePhotoParams) {
                    hogVar = new hoe(((SharePhotoParams) clientActionParams).getQuery());
                } else if (clientActionParams instanceof ShowCardsParams) {
                    ShowCardsParams showCardsParams = (ShowCardsParams) clientActionParams;
                    hogVar = new hof(showCardsParams.getClientSessionId(), showCardsParams.getSelectedCardIds(), showCardsParams.getLiveDataQueryBundle(), showCardsParams.getLiveDataQueryIntent());
                } else {
                    if (clientActionParams instanceof FullScreenRequestParams) {
                        hodVar = new hob();
                    } else if (clientActionParams instanceof TextPasteParams) {
                        hogVar = new hog(((TextPasteParams) clientActionParams).getText());
                    } else {
                        hodVar = clientActionParams instanceof ShareLiveLocationParams ? new hod() : new hnx();
                    }
                    hogVar = hodVar;
                }
            }
            if (hogVar == null) {
                hogVar = new hnx();
            }
        }
        Object parcelable = bundle.getParcelable("INSIGHT_DISPLAY_DETAILS_KEY", InsightDisplayDetails.class);
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InsightDisplayDetails insightDisplayDetails = (InsightDisplayDetails) parcelable;
        Bundle bundle4 = bundle.getBundle("INSIGHT_EXTENDED_DETAILS_KEY");
        return new hnu(hogVar, insightDisplayDetails, bundle4 != null ? new hqb((Icon) bundle4.getParcelable("trailing_icon", Icon.class)) : null, set);
    }
}
