package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import com.android.car.libraries.apphost.external.model.GoogleTabContents;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;

/* loaded from: classes2.dex */
public final /* synthetic */ class gqr implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ gqr(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(afyh.v((CharSequence) obj));
            case 1:
                ((giz) obj).getClass();
                return true;
            case 2:
                return Boolean.valueOf(afyh.v((CharSequence) obj));
            case 3:
                PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
                int i = playbackStateCompat.a;
                return i == 7 ? new aezu(7, playbackStateCompat.g) : Integer.valueOf(i);
            case 4:
                return roc.ap((cie) obj);
            case 5:
                return roc.ap((cie) obj);
            case 6:
                ((ggk) obj).getClass();
                return false;
            case 7:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 8:
                ((ggk) obj).getClass();
                return true;
            case 9:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 10:
                ((ggk) obj).getClass();
                return true;
            case 11:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 12:
                ((ggk) obj).getClass();
                return true;
            case 13:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 14:
                ((ggk) obj).getClass();
                return true;
            case 15:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 16:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 17:
                GoogleTabTemplate googleTabTemplate = (GoogleTabTemplate) obj;
                googleTabTemplate.getClass();
                return Boolean.valueOf(googleTabTemplate.isLoading());
            case 18:
                GoogleTabTemplate googleTabTemplate2 = (GoogleTabTemplate) obj;
                googleTabTemplate2.getClass();
                GoogleTabContents tabContents = googleTabTemplate2.getTabContents();
                tabContents.getClass();
                wb template = tabContents.getTemplate();
                template.getClass();
                return template;
            case 19:
                GridTemplate gridTemplate = (GridTemplate) obj;
                gridTemplate.getClass();
                return Boolean.valueOf(gridTemplate.isLoading());
            default:
                SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                sectionedItemTemplate.getClass();
                return Boolean.valueOf(sectionedItemTemplate.isLoading());
        }
    }
}
