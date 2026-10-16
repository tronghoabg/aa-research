package com.android.car.libraries.apphost.view;

/* JADX INFO: loaded from: classes2.dex */
public final class MicrophoneRecordingView extends android.widget.FrameLayout {
    public final com.android.car.libraries.apphost.view.MicrophoneRecordingView.RecordingBarContainer a;

    public MicrophoneRecordingView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, com.google.android.projection.gearhead.R.layout.microphone_recording_layout, this);
        com.android.car.libraries.apphost.view.MicrophoneRecordingView.RecordingBarContainer recordingBarContainer = (com.android.car.libraries.apphost.view.MicrophoneRecordingView.RecordingBarContainer) findViewById(com.google.android.projection.gearhead.R.id.microphone_recording_bar_container);
        this.a = recordingBarContainer;
        recordingBarContainer.setFocusable(true);
        recordingBarContainer.setOnFocusChangeListener(new defpackage.krq((java.lang.Object) this, 1));
    }

    public MicrophoneRecordingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MicrophoneRecordingView(android.content.Context context) {
        this(context, null);
    }

    public static class RecordingBarContainer extends android.view.View {
        public final android.graphics.drawable.Drawable a;
        public final android.animation.TimeAnimator b;
        private final float[] c;
        private final int[] d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final java.util.Random j;
        private final float[] k;
        private boolean l;
        private float m;

        public RecordingBarContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new float[7];
            int[] iArr = new int[7];
            this.d = iArr;
            this.j = new java.util.Random();
            this.k = new float[4];
            this.l = true;
            this.m = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.a = getResources().getDrawable(com.google.android.projection.gearhead.R.drawable.progress_bar, context.getTheme());
            this.e = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.app_host_audio_progress_bar_width);
            this.f = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.app_host_audio_progress_bar_margin);
            this.g = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.app_host_audio_progress_bar_height_empty);
            this.h = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.app_host_audio_progress_bar_height_max);
            this.i = getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.app_host_audio_progress_left_padding);
            this.b = new android.animation.TimeAnimator();
            java.util.Arrays.fill(iArr, 0);
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
            java.util.Arrays.sort(fArr);
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
        protected final void onDraw(android.graphics.Canvas canvas) {
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
                int iMax = (int) java.lang.Math.max(this.g, (((double) iArr[i]) * 0.88d) + (((double) java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Math.min(f, this.c[i] * f))) * 0.12d));
                iArr[i] = iMax;
                int i5 = this.i;
                android.graphics.drawable.Drawable drawable = this.a;
                int i6 = i5 + ((i2 + i3) * i);
                int i7 = (i4 - iMax) / 2;
                drawable.setBounds(i6, i7, i3 + i6, iMax + i7);
                drawable.draw(canvas);
                i++;
            }
        }

        public RecordingBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public RecordingBarContainer(android.content.Context context) {
            this(context, null);
        }
    }
}
