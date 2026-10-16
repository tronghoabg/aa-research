package com.unity3d.ads.core.data.datasource;

import Bf.r;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "line", "Lef/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ String $prefix;
    final /* synthetic */ G $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, G g9) {
        super(1);
        this.$prefix = str;
        this.$value = g9;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull String line) {
        AbstractC3340k.e(line, "line");
        if (r.k0(line, this.$prefix, false)) {
            G g9 = this.$value;
            String strSubstring = line.substring(this.$prefix.length());
            AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            g9.f39740a = strSubstring;
        }
    }
}
