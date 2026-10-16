package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class rey implements dzg {
    public final /* synthetic */ rzj a;
    public final /* synthetic */ abpt b;
    private final /* synthetic */ int c;

    public /* synthetic */ rey(rzj rzjVar, abpt abptVar, int i) {
        this.c = i;
        this.a = rzjVar;
        this.b = abptVar;
    }

    @Override // defpackage.dzg
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            ouj oujVar = (ouj) obj;
            String str = oujVar.c;
            oui ouiVarB = oui.b(oujVar.d);
            if (ouiVarB == null) {
                ouiVarB = oui.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
            }
            String strQ = uqw.Q(ouiVarB);
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            uqw.V("frames_dropped", oujVar.e, sb);
            uqw.V("index_of_first_dropped_frame", oujVar.f, sb);
            abpt abptVar = oujVar.g;
            if (abptVar == null) {
                abptVar = abpt.a;
            }
            abpt abptVar2 = this.b;
            rzj rzjVar = this.a;
            uqw.W("timestamp_of_first_dropped_frame", uqw.S(abptVar, abptVar2), sb);
            rzjVar.g("%s: %s %s", str, strQ, uqw.T(sb));
            return;
        }
        if (i == 1) {
            final oup oupVar = (oup) obj;
            abpt abptVar3 = oupVar.d;
            if (abptVar3 == null) {
                abptVar3 = abpt.a;
            }
            String strS = uqw.S(abptVar3, this.b);
            String str2 = oupVar.c;
            ouo ouoVarB = ouo.b(oupVar.e);
            if (ouoVarB == null) {
                ouoVarB = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
            }
            final rzj rzjVar2 = this.a;
            rzjVar2.g("%s %s: %s", strS, str2, uqw.Q(ouoVarB)).j(new Runnable() { // from class: rez
                @Override // java.lang.Runnable
                public final void run() {
                    oup oupVar2 = oupVar;
                    int i2 = oupVar2.b & 8;
                    rzj rzjVar3 = rzjVar2;
                    if (i2 != 0) {
                        rzjVar3.l();
                        oun ounVar = oupVar2.f;
                        if (ounVar == null) {
                            ounVar = oun.a;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('{');
                        uqw.V("channel", ounVar.c, sb2);
                        uqw.Y("expected_session_id", (ounVar.b & 4) != 0, ounVar.e, sb2);
                        uqw.Y("invalid_message_type_header", (ounVar.b & 2) != 0, ounVar.d, sb2);
                        uqw.Y("actual_session_id", (ounVar.b & 8) != 0, ounVar.f, sb2);
                        rzjVar3.i(uqw.T(sb2));
                    }
                    if ((oupVar2.b & 16) != 0) {
                        rzjVar3.l();
                        oum oumVar = oupVar2.g;
                        if (oumVar == null) {
                            oumVar = oum.a;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('{');
                        uqw.X("car_ready", oumVar.c, sb3);
                        uqw.X("has_focus", oumVar.d, sb3);
                        uqw.X("should_quit_capturing_thread", oumVar.e, sb3);
                        uqw.X("car_disconnecting", oumVar.f, sb3);
                        boolean z = (oumVar.b & 16) != 0;
                        oul oulVarB = oul.b(oumVar.g);
                        if (oulVarB == null) {
                            oulVarB = oul.FOCUS_CHANGE_COMMAND_UNSPECIFIED;
                        }
                        uqw.Z("focus_change_command", z, uqw.Q(oulVarB), sb3);
                        boolean z2 = (oumVar.b & 32) != 0;
                        ouh ouhVarB = ouh.b(oumVar.h);
                        if (ouhVarB == null) {
                            ouhVarB = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                        }
                        uqw.Z("bottom_half_audio_stream_type", z2, uqw.Q(ouhVarB), sb3);
                        boolean z3 = (oumVar.b & 64) != 0;
                        ouh ouhVarB2 = ouh.b(oumVar.i);
                        if (ouhVarB2 == null) {
                            ouhVarB2 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                        }
                        uqw.Z("new_bottom_half_audio_stream_type", z3, uqw.Q(ouhVarB2), sb3);
                        uqw.Y("music_stream_volume", (oumVar.b & 128) != 0, oumVar.j, sb3);
                        uqw.Y("read_error_code", (oumVar.b & 256) != 0, oumVar.k, sb3);
                        uqw.Y("frames_captured", (oumVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0, oumVar.l, sb3);
                        uqw.Y("system_sound_capture_queue_size", (oumVar.b & 1024) != 0, oumVar.m, sb3);
                        rzjVar3.i(uqw.T(sb3));
                    }
                    if ((oupVar2.b & 32) != 0) {
                        ouk oukVar = oupVar2.h;
                        if (oukVar == null) {
                            oukVar = ouk.a;
                        }
                        rzjVar3.l();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append('{');
                        uqw.X("car_ready", oukVar.c, sb4);
                        uqw.X("in_use", oukVar.d, sb4);
                        uqw.X("started", oukVar.e, sb4);
                        uqw.X("needs_resampling", oukVar.f, sb4);
                        uqw.X("resampling_data_left", oukVar.g, sb4);
                        boolean z4 = (oukVar.b & 8192) != 0;
                        ouf oufVarB = ouf.b(oukVar.p);
                        if (oufVarB == null) {
                            oufVarB = ouf.AUDIO_BOTTOM_HALF_UNSPECIFIED;
                        }
                        uqw.Z("ignored_message_type", z4, uqw.Q(oufVarB), sb4);
                        boolean z5 = (oukVar.b & 32) != 0;
                        ouh ouhVarB3 = ouh.b(oukVar.h);
                        if (ouhVarB3 == null) {
                            ouhVarB3 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                        }
                        uqw.Z("client_stream_type", z5, uqw.Q(ouhVarB3), sb4);
                        boolean z6 = (oukVar.b & 64) != 0;
                        oug ougVarB = oug.b(oukVar.i);
                        if (ougVarB == null) {
                            ougVarB = oug.AUDIO_FORMAT_UNSPECIFIED;
                        }
                        uqw.Z("client_audio_format", z6, uqw.Q(ougVarB), sb4);
                        uqw.aa("transmission_handler_started", (oukVar.b & 128) != 0, oukVar.j, sb4);
                        uqw.aa("transmission_handler_shutting_down", (oukVar.b & 256) != 0, oukVar.k, sb4);
                        uqw.aa("stop_immediately", (oukVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0, oukVar.l, sb4);
                        uqw.aa("stop_notify_focus_handler", (oukVar.b & 1024) != 0, oukVar.m, sb4);
                        uqw.Y("packets_sent_since_start", (oukVar.b & 2048) != 0, oukVar.n, sb4);
                        uqw.Y("total_packets_sent", (oukVar.b & 4096) != 0, oukVar.o, sb4);
                        rzjVar3.i(uqw.T(sb4));
                    }
                }
            });
            return;
        }
        if (i == 2) {
            oud oudVar = (oud) obj;
            abpt abptVar4 = oudVar.d;
            if (abptVar4 == null) {
                abptVar4 = abpt.a;
            }
            String strS2 = uqw.S(abptVar4, this.b);
            String str3 = oudVar.c;
            ouc oucVarB = ouc.b(oudVar.e);
            if (oucVarB == null) {
                oucVarB = ouc.MICROPHONE_SESSION_EVENT_TYPE_UNSPECIFIED;
            }
            this.a.g("%s %s: %s", strS2, str3, uqw.Q(oucVarB));
            return;
        }
        oty otyVar = (oty) obj;
        String str4 = otyVar.c;
        otx otxVarB = otx.b(otyVar.d);
        if (otxVarB == null) {
            otxVarB = otx.DROPPED_MICROPHONE_FRAME_REASON_UNSPECIFIED;
        }
        String strQ2 = uqw.Q(otxVarB);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        uqw.V("frames_dropped", otyVar.e, sb2);
        uqw.V("index_of_first_dropped_frame", otyVar.f, sb2);
        abpt abptVar5 = otyVar.g;
        if (abptVar5 == null) {
            abptVar5 = abpt.a;
        }
        abpt abptVar6 = this.b;
        rzj rzjVar3 = this.a;
        uqw.W("timestamp_of_first_dropped_frame", uqw.S(abptVar5, abptVar6), sb2);
        rzjVar3.g("%s: %s %s", str4, strQ2, uqw.T(sb2));
    }
}
