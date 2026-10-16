package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Action;
import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes.dex */
public enum xkd implements abnz {
    KEYCODE_UNKNOWN(0),
    KEYCODE_SOFT_LEFT(1),
    KEYCODE_SOFT_RIGHT(2),
    KEYCODE_HOME(3),
    KEYCODE_BACK(4),
    KEYCODE_CALL(5),
    KEYCODE_ENDCALL(6),
    KEYCODE_0(7),
    KEYCODE_1(8),
    KEYCODE_2(9),
    KEYCODE_3(10),
    KEYCODE_4(11),
    KEYCODE_5(12),
    KEYCODE_6(13),
    KEYCODE_7(14),
    KEYCODE_8(15),
    KEYCODE_9(16),
    KEYCODE_STAR(17),
    KEYCODE_POUND(18),
    KEYCODE_DPAD_UP(19),
    KEYCODE_DPAD_DOWN(20),
    KEYCODE_DPAD_LEFT(21),
    KEYCODE_DPAD_RIGHT(22),
    KEYCODE_DPAD_CENTER(23),
    KEYCODE_VOLUME_UP(24),
    KEYCODE_VOLUME_DOWN(25),
    KEYCODE_POWER(26),
    KEYCODE_CAMERA(27),
    KEYCODE_CLEAR(28),
    KEYCODE_A(29),
    KEYCODE_B(30),
    KEYCODE_C(31),
    KEYCODE_D(32),
    KEYCODE_E(33),
    KEYCODE_F(34),
    KEYCODE_G(35),
    KEYCODE_H(36),
    KEYCODE_I(37),
    KEYCODE_J(38),
    KEYCODE_K(39),
    KEYCODE_L(40),
    KEYCODE_M(41),
    KEYCODE_N(42),
    KEYCODE_O(43),
    KEYCODE_P(44),
    KEYCODE_Q(45),
    KEYCODE_R(46),
    KEYCODE_S(47),
    KEYCODE_T(48),
    KEYCODE_U(49),
    KEYCODE_V(50),
    KEYCODE_W(51),
    KEYCODE_X(52),
    KEYCODE_Y(53),
    KEYCODE_Z(54),
    KEYCODE_COMMA(55),
    KEYCODE_PERIOD(56),
    KEYCODE_ALT_LEFT(57),
    KEYCODE_ALT_RIGHT(58),
    KEYCODE_SHIFT_LEFT(59),
    KEYCODE_SHIFT_RIGHT(60),
    KEYCODE_TAB(61),
    KEYCODE_SPACE(62),
    KEYCODE_SYM(63),
    KEYCODE_EXPLORER(64),
    KEYCODE_ENVELOPE(65),
    KEYCODE_ENTER(66),
    KEYCODE_DEL(67),
    KEYCODE_GRAVE(68),
    KEYCODE_MINUS(69),
    KEYCODE_EQUALS(70),
    KEYCODE_LEFT_BRACKET(71),
    KEYCODE_RIGHT_BRACKET(72),
    KEYCODE_BACKSLASH(73),
    KEYCODE_SEMICOLON(74),
    KEYCODE_APOSTROPHE(75),
    KEYCODE_SLASH(76),
    KEYCODE_AT(77),
    KEYCODE_NUM(78),
    KEYCODE_HEADSETHOOK(79),
    KEYCODE_FOCUS(80),
    KEYCODE_PLUS(81),
    KEYCODE_MENU(82),
    KEYCODE_NOTIFICATION(83),
    KEYCODE_SEARCH(84),
    KEYCODE_MEDIA_PLAY_PAUSE(85),
    KEYCODE_MEDIA_STOP(86),
    KEYCODE_MEDIA_NEXT(87),
    KEYCODE_MEDIA_PREVIOUS(88),
    KEYCODE_MEDIA_REWIND(89),
    KEYCODE_MEDIA_FAST_FORWARD(90),
    KEYCODE_MUTE(91),
    KEYCODE_PAGE_UP(92),
    KEYCODE_PAGE_DOWN(93),
    KEYCODE_PICTSYMBOLS(94),
    KEYCODE_SWITCH_CHARSET(95),
    KEYCODE_BUTTON_A(96),
    KEYCODE_BUTTON_B(97),
    KEYCODE_BUTTON_C(98),
    KEYCODE_BUTTON_X(99),
    KEYCODE_BUTTON_Y(100),
    KEYCODE_BUTTON_Z(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    KEYCODE_BUTTON_L1(102),
    KEYCODE_BUTTON_R1(103),
    KEYCODE_BUTTON_L2(104),
    KEYCODE_BUTTON_R2(105),
    KEYCODE_BUTTON_THUMBL(106),
    KEYCODE_BUTTON_THUMBR(107),
    KEYCODE_BUTTON_START(108),
    KEYCODE_BUTTON_SELECT(109),
    KEYCODE_BUTTON_MODE(110),
    KEYCODE_ESCAPE(111),
    KEYCODE_FORWARD_DEL(112),
    KEYCODE_CTRL_LEFT(113),
    KEYCODE_CTRL_RIGHT(114),
    KEYCODE_CAPS_LOCK(115),
    KEYCODE_SCROLL_LOCK(116),
    KEYCODE_META_LEFT(117),
    KEYCODE_META_RIGHT(118),
    KEYCODE_FUNCTION(119),
    KEYCODE_SYSRQ(120),
    KEYCODE_BREAK(121),
    KEYCODE_MOVE_HOME(122),
    KEYCODE_MOVE_END(123),
    KEYCODE_INSERT(124),
    KEYCODE_FORWARD(125),
    KEYCODE_MEDIA_PLAY(126),
    KEYCODE_MEDIA_PAUSE(127),
    KEYCODE_MEDIA_CLOSE(128),
    KEYCODE_MEDIA_EJECT(129),
    KEYCODE_MEDIA_RECORD(130),
    KEYCODE_F1(131),
    KEYCODE_F2(132),
    KEYCODE_F3(133),
    KEYCODE_F4(134),
    KEYCODE_F5(135),
    KEYCODE_F6(136),
    KEYCODE_F7(137),
    KEYCODE_F8(138),
    KEYCODE_F9(139),
    KEYCODE_F10(140),
    KEYCODE_F11(141),
    KEYCODE_F12(142),
    KEYCODE_NUM_LOCK(143),
    KEYCODE_NUMPAD_0(144),
    KEYCODE_NUMPAD_1(145),
    KEYCODE_NUMPAD_2(146),
    KEYCODE_NUMPAD_3(147),
    KEYCODE_NUMPAD_4(148),
    KEYCODE_NUMPAD_5(149),
    KEYCODE_NUMPAD_6(150),
    KEYCODE_NUMPAD_7(151),
    KEYCODE_NUMPAD_8(152),
    KEYCODE_NUMPAD_9(153),
    KEYCODE_NUMPAD_DIVIDE(154),
    KEYCODE_NUMPAD_MULTIPLY(155),
    KEYCODE_NUMPAD_SUBTRACT(156),
    KEYCODE_NUMPAD_ADD(157),
    KEYCODE_NUMPAD_DOT(158),
    KEYCODE_NUMPAD_COMMA(159),
    KEYCODE_NUMPAD_ENTER(160),
    KEYCODE_NUMPAD_EQUALS(161),
    KEYCODE_NUMPAD_LEFT_PAREN(162),
    KEYCODE_NUMPAD_RIGHT_PAREN(163),
    KEYCODE_VOLUME_MUTE(164),
    KEYCODE_INFO(165),
    KEYCODE_CHANNEL_UP(166),
    KEYCODE_CHANNEL_DOWN(167),
    KEYCODE_ZOOM_IN(168),
    KEYCODE_ZOOM_OUT(169),
    KEYCODE_TV(170),
    KEYCODE_WINDOW(171),
    KEYCODE_GUIDE(172),
    KEYCODE_DVR(173),
    KEYCODE_BOOKMARK(174),
    KEYCODE_CAPTIONS(175),
    KEYCODE_SETTINGS(176),
    KEYCODE_TV_POWER(177),
    KEYCODE_TV_INPUT(178),
    KEYCODE_STB_POWER(179),
    KEYCODE_STB_INPUT(180),
    KEYCODE_AVR_POWER(181),
    KEYCODE_AVR_INPUT(182),
    KEYCODE_PROG_RED(183),
    KEYCODE_PROG_GREEN(184),
    KEYCODE_PROG_YELLOW(185),
    KEYCODE_PROG_BLUE(186),
    KEYCODE_APP_SWITCH(187),
    KEYCODE_BUTTON_1(188),
    KEYCODE_BUTTON_2(189),
    KEYCODE_BUTTON_3(190),
    KEYCODE_BUTTON_4(191),
    KEYCODE_BUTTON_5(192),
    KEYCODE_BUTTON_6(193),
    KEYCODE_BUTTON_7(194),
    KEYCODE_BUTTON_8(195),
    KEYCODE_BUTTON_9(196),
    KEYCODE_BUTTON_10(197),
    KEYCODE_BUTTON_11(198),
    KEYCODE_BUTTON_12(199),
    KEYCODE_BUTTON_13(200),
    KEYCODE_BUTTON_14(201),
    KEYCODE_BUTTON_15(202),
    KEYCODE_BUTTON_16(203),
    KEYCODE_LANGUAGE_SWITCH(204),
    KEYCODE_MANNER_MODE(205),
    KEYCODE_3D_MODE(206),
    KEYCODE_CONTACTS(207),
    KEYCODE_CALENDAR(208),
    KEYCODE_MUSIC(209),
    KEYCODE_CALCULATOR(210),
    KEYCODE_ZENKAKU_HANKAKU(211),
    KEYCODE_EISU(212),
    KEYCODE_MUHENKAN(213),
    KEYCODE_HENKAN(214),
    KEYCODE_KATAKANA_HIRAGANA(215),
    KEYCODE_YEN(216),
    KEYCODE_RO(217),
    KEYCODE_KANA(218),
    KEYCODE_ASSIST(219),
    KEYCODE_BRIGHTNESS_DOWN(220),
    KEYCODE_BRIGHTNESS_UP(221),
    KEYCODE_MEDIA_AUDIO_TRACK(222),
    KEYCODE_SLEEP(223),
    KEYCODE_WAKEUP(224),
    KEYCODE_PAIRING(225),
    KEYCODE_MEDIA_TOP_MENU(226),
    KEYCODE_11(227),
    KEYCODE_12(228),
    KEYCODE_LAST_CHANNEL(229),
    KEYCODE_TV_DATA_SERVICE(230),
    KEYCODE_VOICE_ASSIST(231),
    KEYCODE_TV_RADIO_SERVICE(232),
    KEYCODE_TV_TELETEXT(233),
    KEYCODE_TV_NUMBER_ENTRY(234),
    KEYCODE_TV_TERRESTRIAL_ANALOG(235),
    KEYCODE_TV_TERRESTRIAL_DIGITAL(236),
    KEYCODE_TV_SATELLITE(237),
    KEYCODE_TV_SATELLITE_BS(238),
    KEYCODE_TV_SATELLITE_CS(239),
    KEYCODE_TV_SATELLITE_SERVICE(240),
    KEYCODE_TV_NETWORK(241),
    KEYCODE_TV_ANTENNA_CABLE(242),
    KEYCODE_TV_INPUT_HDMI_1(243),
    KEYCODE_TV_INPUT_HDMI_2(244),
    KEYCODE_TV_INPUT_HDMI_3(245),
    KEYCODE_TV_INPUT_HDMI_4(246),
    KEYCODE_TV_INPUT_COMPOSITE_1(247),
    KEYCODE_TV_INPUT_COMPOSITE_2(248),
    KEYCODE_TV_INPUT_COMPONENT_1(249),
    KEYCODE_TV_INPUT_COMPONENT_2(250),
    KEYCODE_TV_INPUT_VGA_1(251),
    KEYCODE_TV_AUDIO_DESCRIPTION(252),
    KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP(253),
    KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN(254),
    KEYCODE_TV_ZOOM_MODE(255),
    KEYCODE_TV_CONTENTS_MENU(256),
    KEYCODE_TV_MEDIA_CONTEXT_MENU(257),
    KEYCODE_TV_TIMER_PROGRAMMING(258),
    KEYCODE_HELP(259),
    KEYCODE_NAVIGATE_PREVIOUS(260),
    KEYCODE_NAVIGATE_NEXT(261),
    KEYCODE_NAVIGATE_IN(262),
    KEYCODE_NAVIGATE_OUT(263),
    KEYCODE_DPAD_UP_LEFT(268),
    KEYCODE_DPAD_DOWN_LEFT(269),
    KEYCODE_DPAD_UP_RIGHT(270),
    KEYCODE_DPAD_DOWN_RIGHT(271),
    KEYCODE_SENTINEL(65535),
    KEYCODE_ROTARY_CONTROLLER(65536),
    KEYCODE_MEDIA(65537),
    KEYCODE_NAVIGATION(Action.TYPE_APP_ICON),
    KEYCODE_RADIO(Action.TYPE_BACK),
    KEYCODE_TEL(Action.TYPE_PAN),
    KEYCODE_PRIMARY_BUTTON(Action.TYPE_COMPOSE_MESSAGE),
    KEYCODE_SECONDARY_BUTTON(Action.TYPE_MEDIA_PLAYBACK),
    KEYCODE_TERTIARY_BUTTON(65543),
    KEYCODE_TURN_CARD(65544);

    public final int es;

    xkd(int i) {
        this.es = i;
    }

    public static xkd b(int i) {
        switch (i) {
            case 0:
                return KEYCODE_UNKNOWN;
            case 1:
                return KEYCODE_SOFT_LEFT;
            case 2:
                return KEYCODE_SOFT_RIGHT;
            case 3:
                return KEYCODE_HOME;
            case 4:
                return KEYCODE_BACK;
            case 5:
                return KEYCODE_CALL;
            case 6:
                return KEYCODE_ENDCALL;
            case 7:
                return KEYCODE_0;
            case 8:
                return KEYCODE_1;
            case 9:
                return KEYCODE_2;
            case 10:
                return KEYCODE_3;
            case 11:
                return KEYCODE_4;
            case 12:
                return KEYCODE_5;
            case 13:
                return KEYCODE_6;
            case 14:
                return KEYCODE_7;
            case 15:
                return KEYCODE_8;
            case 16:
                return KEYCODE_9;
            case 17:
                return KEYCODE_STAR;
            case 18:
                return KEYCODE_POUND;
            case 19:
                return KEYCODE_DPAD_UP;
            case 20:
                return KEYCODE_DPAD_DOWN;
            case 21:
                return KEYCODE_DPAD_LEFT;
            case 22:
                return KEYCODE_DPAD_RIGHT;
            case 23:
                return KEYCODE_DPAD_CENTER;
            case 24:
                return KEYCODE_VOLUME_UP;
            case 25:
                return KEYCODE_VOLUME_DOWN;
            case 26:
                return KEYCODE_POWER;
            case 27:
                return KEYCODE_CAMERA;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return KEYCODE_CLEAR;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return KEYCODE_A;
            case 30:
                return KEYCODE_B;
            case 31:
                return KEYCODE_C;
            case 32:
                return KEYCODE_D;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return KEYCODE_E;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return KEYCODE_F;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return KEYCODE_G;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return KEYCODE_H;
            case 37:
                return KEYCODE_I;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return KEYCODE_J;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return KEYCODE_K;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return KEYCODE_L;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return KEYCODE_M;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return KEYCODE_N;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return KEYCODE_O;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return KEYCODE_P;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return KEYCODE_Q;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return KEYCODE_R;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return KEYCODE_S;
            case 48:
                return KEYCODE_T;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return KEYCODE_U;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return KEYCODE_V;
            case 51:
                return KEYCODE_W;
            case 52:
                return KEYCODE_X;
            case 53:
                return KEYCODE_Y;
            case 54:
                return KEYCODE_Z;
            case 55:
                return KEYCODE_COMMA;
            case 56:
                return KEYCODE_PERIOD;
            case 57:
                return KEYCODE_ALT_LEFT;
            case 58:
                return KEYCODE_ALT_RIGHT;
            case 59:
                return KEYCODE_SHIFT_LEFT;
            case 60:
                return KEYCODE_SHIFT_RIGHT;
            case 61:
                return KEYCODE_TAB;
            case 62:
                return KEYCODE_SPACE;
            case 63:
                return KEYCODE_SYM;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return KEYCODE_EXPLORER;
            case 65:
                return KEYCODE_ENVELOPE;
            case 66:
                return KEYCODE_ENTER;
            case 67:
                return KEYCODE_DEL;
            case 68:
                return KEYCODE_GRAVE;
            case 69:
                return KEYCODE_MINUS;
            case 70:
                return KEYCODE_EQUALS;
            case 71:
                return KEYCODE_LEFT_BRACKET;
            case 72:
                return KEYCODE_RIGHT_BRACKET;
            case 73:
                return KEYCODE_BACKSLASH;
            case 74:
                return KEYCODE_SEMICOLON;
            case 75:
                return KEYCODE_APOSTROPHE;
            case 76:
                return KEYCODE_SLASH;
            case 77:
                return KEYCODE_AT;
            case 78:
                return KEYCODE_NUM;
            case 79:
                return KEYCODE_HEADSETHOOK;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return KEYCODE_FOCUS;
            case 81:
                return KEYCODE_PLUS;
            case 82:
                return KEYCODE_MENU;
            case 83:
                return KEYCODE_NOTIFICATION;
            case 84:
                return KEYCODE_SEARCH;
            case 85:
                return KEYCODE_MEDIA_PLAY_PAUSE;
            case 86:
                return KEYCODE_MEDIA_STOP;
            case 87:
                return KEYCODE_MEDIA_NEXT;
            case 88:
                return KEYCODE_MEDIA_PREVIOUS;
            case 89:
                return KEYCODE_MEDIA_REWIND;
            case 90:
                return KEYCODE_MEDIA_FAST_FORWARD;
            case 91:
                return KEYCODE_MUTE;
            case 92:
                return KEYCODE_PAGE_UP;
            case 93:
                return KEYCODE_PAGE_DOWN;
            case 94:
                return KEYCODE_PICTSYMBOLS;
            case 95:
                return KEYCODE_SWITCH_CHARSET;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return KEYCODE_BUTTON_A;
            case 97:
                return KEYCODE_BUTTON_B;
            case 98:
                return KEYCODE_BUTTON_C;
            case 99:
                return KEYCODE_BUTTON_X;
            case 100:
                return KEYCODE_BUTTON_Y;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return KEYCODE_BUTTON_Z;
            case 102:
                return KEYCODE_BUTTON_L1;
            case 103:
                return KEYCODE_BUTTON_R1;
            case 104:
                return KEYCODE_BUTTON_L2;
            case 105:
                return KEYCODE_BUTTON_R2;
            case 106:
                return KEYCODE_BUTTON_THUMBL;
            case 107:
                return KEYCODE_BUTTON_THUMBR;
            case 108:
                return KEYCODE_BUTTON_START;
            case 109:
                return KEYCODE_BUTTON_SELECT;
            case 110:
                return KEYCODE_BUTTON_MODE;
            case 111:
                return KEYCODE_ESCAPE;
            case 112:
                return KEYCODE_FORWARD_DEL;
            case 113:
                return KEYCODE_CTRL_LEFT;
            case 114:
                return KEYCODE_CTRL_RIGHT;
            case 115:
                return KEYCODE_CAPS_LOCK;
            case 116:
                return KEYCODE_SCROLL_LOCK;
            case 117:
                return KEYCODE_META_LEFT;
            case 118:
                return KEYCODE_META_RIGHT;
            case 119:
                return KEYCODE_FUNCTION;
            case 120:
                return KEYCODE_SYSRQ;
            case 121:
                return KEYCODE_BREAK;
            case 122:
                return KEYCODE_MOVE_HOME;
            case 123:
                return KEYCODE_MOVE_END;
            case 124:
                return KEYCODE_INSERT;
            case 125:
                return KEYCODE_FORWARD;
            case 126:
                return KEYCODE_MEDIA_PLAY;
            case 127:
                return KEYCODE_MEDIA_PAUSE;
            case 128:
                return KEYCODE_MEDIA_CLOSE;
            case 129:
                return KEYCODE_MEDIA_EJECT;
            case 130:
                return KEYCODE_MEDIA_RECORD;
            case 131:
                return KEYCODE_F1;
            case 132:
                return KEYCODE_F2;
            case 133:
                return KEYCODE_F3;
            case 134:
                return KEYCODE_F4;
            case 135:
                return KEYCODE_F5;
            case 136:
                return KEYCODE_F6;
            case 137:
                return KEYCODE_F7;
            case 138:
                return KEYCODE_F8;
            case 139:
                return KEYCODE_F9;
            case 140:
                return KEYCODE_F10;
            case 141:
                return KEYCODE_F11;
            case 142:
                return KEYCODE_F12;
            case 143:
                return KEYCODE_NUM_LOCK;
            case 144:
                return KEYCODE_NUMPAD_0;
            case 145:
                return KEYCODE_NUMPAD_1;
            case 146:
                return KEYCODE_NUMPAD_2;
            case 147:
                return KEYCODE_NUMPAD_3;
            case 148:
                return KEYCODE_NUMPAD_4;
            case 149:
                return KEYCODE_NUMPAD_5;
            case 150:
                return KEYCODE_NUMPAD_6;
            case 151:
                return KEYCODE_NUMPAD_7;
            case 152:
                return KEYCODE_NUMPAD_8;
            case 153:
                return KEYCODE_NUMPAD_9;
            case 154:
                return KEYCODE_NUMPAD_DIVIDE;
            case 155:
                return KEYCODE_NUMPAD_MULTIPLY;
            case 156:
                return KEYCODE_NUMPAD_SUBTRACT;
            case 157:
                return KEYCODE_NUMPAD_ADD;
            case 158:
                return KEYCODE_NUMPAD_DOT;
            case 159:
                return KEYCODE_NUMPAD_COMMA;
            case 160:
                return KEYCODE_NUMPAD_ENTER;
            case 161:
                return KEYCODE_NUMPAD_EQUALS;
            case 162:
                return KEYCODE_NUMPAD_LEFT_PAREN;
            case 163:
                return KEYCODE_NUMPAD_RIGHT_PAREN;
            case 164:
                return KEYCODE_VOLUME_MUTE;
            case 165:
                return KEYCODE_INFO;
            case 166:
                return KEYCODE_CHANNEL_UP;
            case 167:
                return KEYCODE_CHANNEL_DOWN;
            case 168:
                return KEYCODE_ZOOM_IN;
            case 169:
                return KEYCODE_ZOOM_OUT;
            case 170:
                return KEYCODE_TV;
            case 171:
                return KEYCODE_WINDOW;
            case 172:
                return KEYCODE_GUIDE;
            case 173:
                return KEYCODE_DVR;
            case 174:
                return KEYCODE_BOOKMARK;
            case 175:
                return KEYCODE_CAPTIONS;
            case 176:
                return KEYCODE_SETTINGS;
            case 177:
                return KEYCODE_TV_POWER;
            case 178:
                return KEYCODE_TV_INPUT;
            case 179:
                return KEYCODE_STB_POWER;
            case 180:
                return KEYCODE_STB_INPUT;
            case 181:
                return KEYCODE_AVR_POWER;
            case 182:
                return KEYCODE_AVR_INPUT;
            case 183:
                return KEYCODE_PROG_RED;
            case 184:
                return KEYCODE_PROG_GREEN;
            case 185:
                return KEYCODE_PROG_YELLOW;
            case 186:
                return KEYCODE_PROG_BLUE;
            case 187:
                return KEYCODE_APP_SWITCH;
            case 188:
                return KEYCODE_BUTTON_1;
            case 189:
                return KEYCODE_BUTTON_2;
            case 190:
                return KEYCODE_BUTTON_3;
            case 191:
                return KEYCODE_BUTTON_4;
            case 192:
                return KEYCODE_BUTTON_5;
            case 193:
                return KEYCODE_BUTTON_6;
            case 194:
                return KEYCODE_BUTTON_7;
            case 195:
                return KEYCODE_BUTTON_8;
            case 196:
                return KEYCODE_BUTTON_9;
            case 197:
                return KEYCODE_BUTTON_10;
            case 198:
                return KEYCODE_BUTTON_11;
            case 199:
                return KEYCODE_BUTTON_12;
            case 200:
                return KEYCODE_BUTTON_13;
            case 201:
                return KEYCODE_BUTTON_14;
            case 202:
                return KEYCODE_BUTTON_15;
            case 203:
                return KEYCODE_BUTTON_16;
            case 204:
                return KEYCODE_LANGUAGE_SWITCH;
            case 205:
                return KEYCODE_MANNER_MODE;
            case 206:
                return KEYCODE_3D_MODE;
            case 207:
                return KEYCODE_CONTACTS;
            case 208:
                return KEYCODE_CALENDAR;
            case 209:
                return KEYCODE_MUSIC;
            case 210:
                return KEYCODE_CALCULATOR;
            case 211:
                return KEYCODE_ZENKAKU_HANKAKU;
            case 212:
                return KEYCODE_EISU;
            case 213:
                return KEYCODE_MUHENKAN;
            case 214:
                return KEYCODE_HENKAN;
            case 215:
                return KEYCODE_KATAKANA_HIRAGANA;
            case 216:
                return KEYCODE_YEN;
            case 217:
                return KEYCODE_RO;
            case 218:
                return KEYCODE_KANA;
            case 219:
                return KEYCODE_ASSIST;
            case 220:
                return KEYCODE_BRIGHTNESS_DOWN;
            case 221:
                return KEYCODE_BRIGHTNESS_UP;
            case 222:
                return KEYCODE_MEDIA_AUDIO_TRACK;
            case 223:
                return KEYCODE_SLEEP;
            case 224:
                return KEYCODE_WAKEUP;
            case 225:
                return KEYCODE_PAIRING;
            case 226:
                return KEYCODE_MEDIA_TOP_MENU;
            case 227:
                return KEYCODE_11;
            case 228:
                return KEYCODE_12;
            case 229:
                return KEYCODE_LAST_CHANNEL;
            case 230:
                return KEYCODE_TV_DATA_SERVICE;
            case 231:
                return KEYCODE_VOICE_ASSIST;
            case 232:
                return KEYCODE_TV_RADIO_SERVICE;
            case 233:
                return KEYCODE_TV_TELETEXT;
            case 234:
                return KEYCODE_TV_NUMBER_ENTRY;
            case 235:
                return KEYCODE_TV_TERRESTRIAL_ANALOG;
            case 236:
                return KEYCODE_TV_TERRESTRIAL_DIGITAL;
            case 237:
                return KEYCODE_TV_SATELLITE;
            case 238:
                return KEYCODE_TV_SATELLITE_BS;
            case 239:
                return KEYCODE_TV_SATELLITE_CS;
            case 240:
                return KEYCODE_TV_SATELLITE_SERVICE;
            case 241:
                return KEYCODE_TV_NETWORK;
            case 242:
                return KEYCODE_TV_ANTENNA_CABLE;
            case 243:
                return KEYCODE_TV_INPUT_HDMI_1;
            case 244:
                return KEYCODE_TV_INPUT_HDMI_2;
            case 245:
                return KEYCODE_TV_INPUT_HDMI_3;
            case 246:
                return KEYCODE_TV_INPUT_HDMI_4;
            case 247:
                return KEYCODE_TV_INPUT_COMPOSITE_1;
            case 248:
                return KEYCODE_TV_INPUT_COMPOSITE_2;
            case 249:
                return KEYCODE_TV_INPUT_COMPONENT_1;
            case 250:
                return KEYCODE_TV_INPUT_COMPONENT_2;
            case 251:
                return KEYCODE_TV_INPUT_VGA_1;
            case 252:
                return KEYCODE_TV_AUDIO_DESCRIPTION;
            case 253:
                return KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP;
            case 254:
                return KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN;
            case 255:
                return KEYCODE_TV_ZOOM_MODE;
            case 256:
                return KEYCODE_TV_CONTENTS_MENU;
            case 257:
                return KEYCODE_TV_MEDIA_CONTEXT_MENU;
            case 258:
                return KEYCODE_TV_TIMER_PROGRAMMING;
            case 259:
                return KEYCODE_HELP;
            case 260:
                return KEYCODE_NAVIGATE_PREVIOUS;
            case 261:
                return KEYCODE_NAVIGATE_NEXT;
            case 262:
                return KEYCODE_NAVIGATE_IN;
            case 263:
                return KEYCODE_NAVIGATE_OUT;
            default:
                switch (i) {
                    case 268:
                        return KEYCODE_DPAD_UP_LEFT;
                    case 269:
                        return KEYCODE_DPAD_DOWN_LEFT;
                    case 270:
                        return KEYCODE_DPAD_UP_RIGHT;
                    case 271:
                        return KEYCODE_DPAD_DOWN_RIGHT;
                    default:
                        switch (i) {
                            case 65535:
                                return KEYCODE_SENTINEL;
                            case 65536:
                                return KEYCODE_ROTARY_CONTROLLER;
                            case 65537:
                                return KEYCODE_MEDIA;
                            case Action.TYPE_APP_ICON /* 65538 */:
                                return KEYCODE_NAVIGATION;
                            case Action.TYPE_BACK /* 65539 */:
                                return KEYCODE_RADIO;
                            case Action.TYPE_PAN /* 65540 */:
                                return KEYCODE_TEL;
                            case Action.TYPE_COMPOSE_MESSAGE /* 65541 */:
                                return KEYCODE_PRIMARY_BUTTON;
                            case Action.TYPE_MEDIA_PLAYBACK /* 65542 */:
                                return KEYCODE_SECONDARY_BUTTON;
                            case 65543:
                                return KEYCODE_TERTIARY_BUTTON;
                            case 65544:
                                return KEYCODE_TURN_CARD;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.es;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.es);
    }
}
