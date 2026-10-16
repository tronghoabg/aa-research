package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ap;
import android.support.v7.widget.bn;
import android.support.v7.widget.w;
import android.support.v7.widget.y;
import android.support.v7.widget.z;
import android.util.AttributeSet;
import com.google.android.material.b.e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.g.a;
import com.google.android.material.textfield.ai;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    protected final w a(Context context, AttributeSet attributeSet) {
        return new ai(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final y b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final z c(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final ap d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final bn e(Context context, AttributeSet attributeSet) {
        return new com.google.android.material.l.a(context, attributeSet);
    }
}
