package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class hnz implements hnw {
    private final /* synthetic */ int a;

    public hnz(int i) {
        this.a = i;
    }

    @Override // defpackage.hnw
    public final /* synthetic */ hdg a(Bundle bundle) {
        Object next;
        switch (this.a) {
            case 0:
                bundle.getString("uuid");
                a$$ExternalSyntheticApiModelOutline0.m(bundle.getParcelable("remote_action", ep$$ExternalSyntheticApiModelOutline1.m296m()));
                bundle.getString("overwrite_subtitle");
                hny hnyVar = hny.a;
                String string = bundle.getString("action_type");
                afao afaoVar = new afao((afar) hny.f);
                while (true) {
                    if (afaoVar.hasNext()) {
                        next = afaoVar.next();
                        if (affa.f(((hny) next).g, string)) {
                        }
                    } else {
                        next = null;
                    }
                }
                bundle.getString("close_content_description");
                return new hoa();
            case 1:
                return new hnx();
            case 2:
                return new hob();
            case 3:
                return new hoc();
            case 4:
                return new hod();
            case 5:
                String string2 = bundle.getString("SHARE_PHOTO_PARAMS__QUERY");
                return new hoe(string2 != null ? string2 : "");
            case 6:
                String string3 = bundle.getString("SHOW_CARDS_PARAMS__CLIENT_SESSION_ID");
                String str = string3 != null ? string3 : "";
                List stringArrayList = bundle.getStringArrayList("SHOW_CARDS_PARAMS__SELECTED_CARD_IDS");
                if (stringArrayList == null) {
                    stringArrayList = afbe.a;
                }
                return new hof(str, stringArrayList, bundle.getBundle("SHOW_CARDS_PARAMS__LIVE_DATA_QUERY_BUNDLE"), (PendingIntent) bundle.getParcelable("SHOW_CARDS_PARAMS__LIVE_DATA_QUERY_INTENT", PendingIntent.class));
            default:
                String string4 = bundle.getString("TEXT_PASTE_PARAMS__TEXT");
                return new hog(string4 != null ? string4 : "");
        }
    }
}
