package com.waze.ui.p;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.waze.map.dq;
import com.waze.map.dr;
import com.waze.map.ec;
import com.waze.map.gb;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface l {
    View a(Context context, LifecycleOwner lifecycleOwner, bn bnVar, ec ecVar, boolean z, dr drVar);

    ec b();

    gb c(af afVar, ch chVar, ch chVar2, Context context, dq dqVar);
}
