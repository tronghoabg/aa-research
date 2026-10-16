package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class nam extends afey implements afec {
    final /* synthetic */ airp a;
    final /* synthetic */ airp b;
    final /* synthetic */ MediaSuggestionFragment c;
    final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nam(airp airpVar, airp airpVar2, MediaSuggestionFragment mediaSuggestionFragment, View view) {
        super(1, afez.class, "handleSuggestions", "onContentViewCreated$handleSuggestions(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lcom/google/android/apps/auto/components/system/dashboard/media/MediaSuggestionFragment;Landroid/view/View;Ljava/util/List;)V", 0);
        this.a = airpVar;
        this.b = airpVar2;
        this.c = mediaSuggestionFragment;
        this.d = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
        MediaSuggestionFragment mediaSuggestionFragment;
        nak nakVar;
        List list = (List) obj;
        list.getClass();
        List listBU = woy.bU(list);
        yop yopVarL = MediaSuggestionFragment.a.l();
        Object objValueOf = Integer.valueOf(list.size());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            mediaSuggestionFragment = this.c;
            nakVar = null;
            if (!it.hasNext()) {
                break;
            }
            lpt lptVar = (lpt) it.next();
            CharSequence charSequenceF = lptVar != null ? lptVar.f(mediaSuggestionFragment.getContext()) : null;
            if (charSequenceF != null) {
                arrayList.add(charSequenceF);
            }
        }
        airp airpVar = this.a;
        yopVarL.R("Received %s suggestions (%s), %s non-null suggestions", objValueOf, arrayList, Integer.valueOf(listBU.size()));
        Iterator itA = airpVar.a();
        ?? r4 = 0;
        int i = 0;
        while (true) {
            if (!itA.hasNext()) {
                break;
            }
            Object next = itA.next();
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            View view = (View) next;
            lpt lptVar2 = (lpt) woy.bI(list, i);
            int size = listBU.size();
            int size2 = list.size();
            if (view.getId() == R.id.no_additional_media_suggestions) {
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, r4, list.size() - listBU.size()));
                view.setVisibility(size < size2 ? r4 : 8);
            } else {
                view.setVisibility(lptVar2 != null ? r4 : 8);
                if (lptVar2 != null) {
                    Object tag = view.getTag();
                    nak nakVar2 = tag instanceof nak ? (nak) tag : nakVar;
                    if (nakVar2 == null) {
                        nakVar2 = new nak(mediaSuggestionFragment, view);
                        view.setTag(nakVar2);
                    }
                    Context context = this.d.getContext();
                    context.getClass();
                    nakVar2.a.setText(lptVar2.f(context));
                    lgi.d(nakVar2.c, GhIcon.j(lptVar2.a()), true, true, r4);
                    gjo gjoVar = new gjo(lptVar2.c(), lptVar2.b(), nakVar);
                    Bitmap bitmap = gjoVar.d;
                    MediaSuggestionFragment mediaSuggestionFragment2 = nakVar2.e;
                    ImageView imageView = nakVar2.b;
                    if (bitmap == null && gjoVar.b == null) {
                        hrt.d(mediaSuggestionFragment2).c().g(Integer.valueOf(R.drawable.media_suggestion_album_art_placeholder)).n(iek.d()).m(icg.b()).p(imageView);
                    } else {
                        hsq hsqVarD = hrt.d(mediaSuggestionFragment2).d(bitmap);
                        hsqVarD.getClass();
                        hsq hsqVarE = hrt.d(mediaSuggestionFragment2).e(gjoVar.b);
                        hsqVarE.getClass();
                        urf urfVar = new urf();
                        urfVar.b();
                        iez iezVarA = urfVar.a();
                        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(R.dimen.dashboard_media_recommendation_max_album_art_size);
                        hsq hsqVarN = hsqVarE.n(iek.d());
                        icg icgVar = new icg();
                        icgVar.c(iezVarA);
                        ((hsq) ((hsq) hsqVarN.m(icgVar).l(hsqVarD).H(R.drawable.media_suggestion_album_art_placeholder)).G(dimensionPixelSize, dimensionPixelSize)).p(imageView);
                    }
                    nakVar = null;
                    nakVar2.d.setOnClickListener(new jmq(mediaSuggestionFragment2, lptVar2, 14, 0 == true ? 1 : 0));
                }
            }
            i = i2;
            r4 = 0;
        }
        Iterator itA2 = this.b.a();
        int i3 = 0;
        while (itA2.hasNext()) {
            Object next2 = itA2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                woy.bo();
            }
            ((View) next2).setVisibility(i3 < list.size() ? 0 : 8);
            i3 = i4;
        }
        mediaSuggestionFragment.b().b(listBU);
        return afak.a;
    }
}
