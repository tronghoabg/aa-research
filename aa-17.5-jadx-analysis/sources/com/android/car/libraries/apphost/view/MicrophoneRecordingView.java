package com.android.car.libraries.apphost.view;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.krj;
import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class MicrophoneRecordingView extends FrameLayout {
    public final RecordingBarContainer a;

    public MicrophoneRecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.microphone_recording_layout, this);
        RecordingBarContainer recordingBarContainer = (RecordingBarContainer) findViewById(R.id.microphone_recording_bar_container);
        this.a = recordingBarContainer;
        recordingBarContainer.setFocusable(true);
        recordingBarContainer.setOnFocusChangeListener(new krj((Object) this, 1));
    }

    public MicrophoneRecordingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MicrophoneRecordingView(Context context) {
        this(context, null);
    }

    public static class RecordingBarContainer extends View {
        public final Drawable a;
        public final TimeAnimator b;
        private final float[] c;
        private final int[] d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final Random j;
        private final float[] k;
        private boolean l;
        private float m;

        public RecordingBarContainer(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new float[7];
            int[] iArr = new int[7];
            this.d = iArr;
            this.j = new Random();
            this.k = new float[4];
            this.l = true;
            this.m = BitmapDescriptorFactory.HUE_RED;
            this.a = getResources().getDrawable(R.drawable.progress_bar, context.getTheme());
            this.e = getResources().getDimensionPixelSize(R.dimen.app_host_audio_progress_bar_width);
            this.f = getResources().getDimensionPixelSize(R.dimen.app_host_audio_progress_bar_margin);
            this.g = getResources().getDimensionPixelSize(R.dimen.app_host_audio_progress_bar_height_empty);
            this.h = getResources().getDimensionPixelSize(R.dimen.app_host_audio_progress_bar_height_max);
            this.i = getResources().getDimensionPixelOffset(R.dimen.app_host_audio_progress_left_padding);
            this.b = new TimeAnimator();
            Arrays.fill(iArr, 0);
            a();
        }

        public final void a() {
            float[] fArr;
            boolean z = this.l;
            float f = this.m;
            int i = 0;
            if (z) {
                if (f >= 0.95d) {
                    this.l = false;
                }
                this.m = f + 0.05f;
            } else {
                if (f <= 0.05d) {
                    this.l = true;
                }
                this.m = f - 0.05f;
            }
            int i2 = 0;
            while (true) {
                fArr = this.k;
                int length = fArr.length;
                if (i2 >= 4) {
                    break;
                }
                fArr[i2] = this.j.nextFloat() * this.m;
                i2++;
            }
            Arrays.sort(fArr);
            while (true) {
                int length2 = fArr.length;
                if (i >= 4) {
                    return;
                }
                float[] fArr2 = this.c;
                fArr2[i] = fArr[i];
                fArr2[6 - i] = fArr[i];
                i++;
            }
        }

        @Override // android.view.View
        protected final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int i = 0;
            while (true) {
                int[] iArr = this.d;
                int length = iArr.length;
                if (i >= 7) {
                    return;
                }
                int i2 = this.f;
                int i3 = this.e;
                int i4 = this.h;
                float f = i4;
                int iMax = (int) Math.max(this.g, (iArr[i] * 0.88d) + (Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f, this.c[i] * f)) * 0.12d));
                iArr[i] = iMax;
                int i5 = this.i;
                Drawable drawable = this.a;
                int i6 = i5 + ((i2 + i3) * i);
                int i7 = (i4 - iMax) / 2;
                drawable.setBounds(i6, i7, i3 + i6, iMax + i7);
                drawable.draw(canvas);
                i++;
            }
        }

        public RecordingBarContainer(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public RecordingBarContainer(Context context) {
            this(context, null);
        }
    }
}
