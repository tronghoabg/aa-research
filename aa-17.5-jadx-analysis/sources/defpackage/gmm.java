package defpackage;

import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmm {
    public boolean a;
    public ItemList b;
    public final List c;
    public final List d;
    public Header e;

    public gmm(GoogleListTemplate googleListTemplate) {
        this.a = googleListTemplate.getIsLoading();
        this.b = googleListTemplate.getSingleList();
        this.e = googleListTemplate.getHeader();
        this.c = new ArrayList(googleListTemplate.getSectionedLists());
        this.d = new ArrayList(googleListTemplate.getActions());
    }

    public gmm() {
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
}
