package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nak {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;
    public final View d;
    final /* synthetic */ MediaSuggestionFragment e;

    public nak(MediaSuggestionFragment mediaSuggestionFragment, View view) {
        view.getClass();
        this.e = mediaSuggestionFragment;
        View viewFindViewById = view.findViewById(R.id.media_suggestion_title);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.album_art);
        viewFindViewById2.getClass();
        this.b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.source_badge);
        viewFindViewById3.getClass();
        this.c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.primary_target);
        viewFindViewById4.getClass();
        this.d = viewFindViewById4;
    }
}
