package com.unity3d.ads.core.domain;

import cg.C1621j;
import com.google.protobuf.ByteString;
import ff.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcg/j;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AndroidGetIsAdActivity$activities$2 extends AbstractC3343n implements tf.a {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    @Override // tf.a
    @NotNull
    public final List<C1621j> invoke() {
        List<ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        AbstractC3340k.d(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        List<ByteString> list = observableAndroidActivitiesList;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            arrayList.add(C1621j.l(Arrays.copyOf(byteArray, byteArray.length)));
        }
        return arrayList;
    }
}
