package com.waze.r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.exoplayer.offline.Download;
import com.waze.R;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;
import com.waze.sharedrive.g.ac;
import com.waze.sharedrive.g.ae;
import com.waze.sharedrive.g.af;
import com.waze.sharedrive.g.ag;
import com.waze.sharedrive.g.ai;
import com.waze.sharedrive.g.bc;
import com.waze.sharedui.views.ad;
import com.waze.sound.ix;
import com.waze.sound.iy;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33499a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33500b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f33500b = i2;
        this.f33499a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f33500b) {
            case 0:
                break;
            case 1:
                ((ad) this.f33499a).u((String) obj);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                new cs((AddressItem) obj).b((Activity) this.f33499a, 1);
                break;
            case 5:
                break;
            case 6:
                List list = (List) obj;
                x.f(list, "it");
                list.add(this.f33499a);
                break;
            case 7:
                List list2 = (List) obj;
                x.f(list2, "it");
                list2.remove(this.f33499a);
                break;
            case 8:
                View view = (View) obj;
                x.f(view, "view");
                ((ImageView) view.findViewById(R.id.live_drive_participant_pin_image)).setImageBitmap((Bitmap) this.f33499a);
                break;
            case 9:
                View view2 = (View) obj;
                x.f(view2, "view");
                ((ImageView) view2.findViewById(R.id.live_drive_participant_pin_image)).setImageDrawable((Drawable) this.f33499a);
                break;
            case 10:
                ActivityResult activityResult = (ActivityResult) obj;
                x.f(activityResult, "result");
                if (activityResult.getResultCode() == -1) {
                    this.f33499a.invoke();
                }
                break;
            case 11:
                NavigationItem navigationItem = (NavigationItem) obj;
                x.f(navigationItem, "it");
                this.f33499a.invoke(new com.waze.sharedrive.g.a(navigationItem));
                break;
            case 12:
                RtAlertItem rtAlertItem = (RtAlertItem) obj;
                x.f(rtAlertItem, "it");
                this.f33499a.invoke(new com.waze.sharedrive.g.b(rtAlertItem));
                break;
            case 13:
                LazyListScope lazyListScope = (LazyListScope) obj;
                int i2 = ag.f38615a;
                x.f(lazyListScope, "$this$LazyRow");
                List listA = ((ai) this.f33499a).a();
                lazyListScope.items(listA.size(), new ae(new ac(0), listA), new bc(listA, 1), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new af(listA)));
                break;
            case 14:
                break;
            case 15:
                this.f33499a.a((String) obj);
                break;
            case 16:
                this.f33499a.a((String) obj);
                break;
            case 17:
                this.f33499a.a((String) obj);
                break;
            case 18:
                x.f((Download) obj, "<unused var>");
                this.f33499a.a(iy.f40267a);
                break;
            case 19:
                Download download = (Download) obj;
                x.f(download, "download");
                this.f33499a.a(new ix(Integer.valueOf(download.failureReason)));
                break;
            default:
                this.f33499a.a((String) obj);
                break;
        }
        return ab.f48028a;
    }
}
