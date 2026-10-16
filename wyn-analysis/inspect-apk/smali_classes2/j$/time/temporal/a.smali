.class public final enum Lj$/time/temporal/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/q;


# static fields
.field public static final enum ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum AMPM_OF_DAY:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum DAY_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum DAY_OF_WEEK:Lj$/time/temporal/a;

.field public static final enum DAY_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum EPOCH_DAY:Lj$/time/temporal/a;

.field public static final enum ERA:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum INSTANT_SECONDS:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_HOUR:Lj$/time/temporal/a;

.field public static final enum MONTH_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum NANO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum NANO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum OFFSET_SECONDS:Lj$/time/temporal/a;

.field public static final enum PROLEPTIC_MONTH:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_DAY:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_MINUTE:Lj$/time/temporal/a;

.field public static final enum YEAR:Lj$/time/temporal/a;

.field public static final enum YEAR_OF_ERA:Lj$/time/temporal/a;

.field private static final synthetic c:[Lj$/time/temporal/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lj$/time/temporal/t;


# direct methods
.method static constructor <clinit>()V
    .locals 62

    .line 120
    new-instance v0, Lj$/time/temporal/a;

    sget-object v4, Lj$/time/temporal/ChronoUnit;->NANOS:Lj$/time/temporal/ChronoUnit;

    sget-object v9, Lj$/time/temporal/ChronoUnit;->SECONDS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v13, 0x0

    const-wide/32 v10, 0x3b9ac9ff

    invoke-static {v13, v14, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v6

    const/4 v2, 0x0

    const-string v3, "NanoOfSecond"

    const-string v1, "NANO_OF_SECOND"

    move-object v5, v9

    invoke-direct/range {v0 .. v6}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v0, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    .line 136
    new-instance v1, Lj$/time/temporal/a;

    sget-object v19, Lj$/time/temporal/ChronoUnit;->DAYS:Lj$/time/temporal/ChronoUnit;

    const-wide v2, 0x4e94914effffL

    invoke-static {v13, v14, v2, v3}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v7

    const/4 v3, 0x1

    move-object v5, v4

    const-string v4, "NanoOfDay"

    const-string v2, "NANO_OF_DAY"

    move-object/from16 v6, v19

    invoke-direct/range {v1 .. v7}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v1, Lj$/time/temporal/a;->NANO_OF_DAY:Lj$/time/temporal/a;

    .line 156
    new-instance v5, Lj$/time/temporal/a;

    move-wide v2, v10

    move-object v10, v9

    sget-object v9, Lj$/time/temporal/ChronoUnit;->MICROS:Lj$/time/temporal/ChronoUnit;

    const-wide/32 v6, 0xf423f

    invoke-static {v13, v14, v6, v7}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const/4 v7, 0x2

    const-string v8, "MicroOfSecond"

    const-string v6, "MICRO_OF_SECOND"

    invoke-direct/range {v5 .. v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object v4, v5

    move-object/from16 v20, v19

    move-object/from16 v19, v9

    move-object v9, v10

    sput-object v4, Lj$/time/temporal/a;->MICRO_OF_SECOND:Lj$/time/temporal/a;

    .line 175
    new-instance v15, Lj$/time/temporal/a;

    const-wide v5, 0x141dd75fffL

    invoke-static {v13, v14, v5, v6}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x3

    const-string v18, "MicroOfDay"

    const-string v16, "MICRO_OF_DAY"

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v23, v15

    move-object/from16 v19, v20

    sput-object v23, Lj$/time/temporal/a;->MICRO_OF_DAY:Lj$/time/temporal/a;

    .line 195
    new-instance v5, Lj$/time/temporal/a;

    sget-object v9, Lj$/time/temporal/ChronoUnit;->MILLIS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v6, 0x3e7

    invoke-static {v13, v14, v6, v7}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const/4 v7, 0x4

    const-string v8, "MilliOfSecond"

    const-string v6, "MILLI_OF_SECOND"

    invoke-direct/range {v5 .. v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v24, v5

    move-object/from16 v19, v9

    move-object v9, v10

    sput-object v24, Lj$/time/temporal/a;->MILLI_OF_SECOND:Lj$/time/temporal/a;

    .line 214
    new-instance v15, Lj$/time/temporal/a;

    const-wide/32 v5, 0x5265bff

    invoke-static {v13, v14, v5, v6}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x5

    const-string v18, "MilliOfDay"

    const-string v16, "MILLI_OF_DAY"

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v25, v15

    move-object/from16 v19, v20

    sput-object v25, Lj$/time/temporal/a;->MILLI_OF_DAY:Lj$/time/temporal/a;

    .line 224
    new-instance v5, Lj$/time/temporal/a;

    sget-object v10, Lj$/time/temporal/ChronoUnit;->MINUTES:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v6, 0x3b

    invoke-static {v13, v14, v6, v7}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const-string v8, "SecondOfMinute"

    const/4 v12, 0x0

    move-wide v15, v6

    const-string v6, "SECOND_OF_MINUTE"

    const/4 v7, 0x6

    move-wide v2, v15

    invoke-direct/range {v5 .. v12}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object v12, v5

    move-object/from16 v30, v10

    sput-object v12, Lj$/time/temporal/a;->SECOND_OF_MINUTE:Lj$/time/temporal/a;

    .line 236
    new-instance v5, Lj$/time/temporal/a;

    const-wide/32 v6, 0x1517f

    invoke-static {v13, v14, v6, v7}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const/4 v7, 0x7

    const-string v8, "SecondOfDay"

    const-string v6, "SECOND_OF_DAY"

    move-object/from16 v10, v19

    invoke-direct/range {v5 .. v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v34, v5

    sput-object v34, Lj$/time/temporal/a;->SECOND_OF_DAY:Lj$/time/temporal/a;

    .line 246
    new-instance v26, Lj$/time/temporal/a;

    sget-object v39, Lj$/time/temporal/ChronoUnit;->HOURS:Lj$/time/temporal/ChronoUnit;

    invoke-static {v13, v14, v2, v3}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v32

    const-string v29, "MinuteOfHour"

    const/16 v33, 0x0

    const-string v27, "MINUTE_OF_HOUR"

    const/16 v28, 0x8

    move-object/from16 v31, v39

    invoke-direct/range {v26 .. v33}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    sput-object v26, Lj$/time/temporal/a;->MINUTE_OF_HOUR:Lj$/time/temporal/a;

    .line 257
    new-instance v15, Lj$/time/temporal/a;

    const-wide/16 v2, 0x59f

    invoke-static {v13, v14, v2, v3}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x9

    const-string v18, "MinuteOfDay"

    const-string v16, "MINUTE_OF_DAY"

    move-object/from16 v19, v30

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object v2, v15

    move-object/from16 v19, v20

    sput-object v2, Lj$/time/temporal/a;->MINUTE_OF_DAY:Lj$/time/temporal/a;

    .line 273
    new-instance v35, Lj$/time/temporal/a;

    sget-object v40, Lj$/time/temporal/ChronoUnit;->HALF_DAYS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v5, 0xb

    invoke-static {v13, v14, v5, v6}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v41

    const/16 v37, 0xa

    const-string v38, "HourOfAmPm"

    const-string v36, "HOUR_OF_AMPM"

    invoke-direct/range {v35 .. v41}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v3, v35

    sput-object v3, Lj$/time/temporal/a;->HOUR_OF_AMPM:Lj$/time/temporal/a;

    .line 289
    new-instance v35, Lj$/time/temporal/a;

    const-wide/16 v5, 0x1

    const-wide/16 v7, 0xc

    invoke-static {v5, v6, v7, v8}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v41

    const/16 v37, 0xb

    const-string v38, "ClockHourOfAmPm"

    const-string v36, "CLOCK_HOUR_OF_AMPM"

    invoke-direct/range {v35 .. v41}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v35, Lj$/time/temporal/a;->CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

    .line 306
    new-instance v15, Lj$/time/temporal/a;

    const-wide/16 v10, 0x17

    invoke-static {v13, v14, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const-string v18, "HourOfDay"

    const/16 v22, 0x0

    const-string v16, "HOUR_OF_DAY"

    const/16 v17, 0xc

    move-object/from16 v19, v39

    invoke-direct/range {v15 .. v22}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object/from16 v27, v15

    move-object/from16 v19, v20

    sput-object v27, Lj$/time/temporal/a;->HOUR_OF_DAY:Lj$/time/temporal/a;

    .line 322
    new-instance v15, Lj$/time/temporal/a;

    const-wide/16 v10, 0x18

    invoke-static {v5, v6, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0xd

    const-string v18, "ClockHourOfDay"

    const-string v16, "CLOCK_HOUR_OF_DAY"

    move-object/from16 v19, v39

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v28, v15

    move-object/from16 v19, v20

    sput-object v28, Lj$/time/temporal/a;->CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

    .line 335
    new-instance v15, Lj$/time/temporal/a;

    invoke-static {v13, v14, v5, v6}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const-string v18, "AmPmOfDay"

    const-string v16, "AMPM_OF_DAY"

    const/16 v17, 0xe

    move-object/from16 v19, v40

    invoke-direct/range {v15 .. v22}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object/from16 v29, v15

    move-object/from16 v19, v20

    sput-object v29, Lj$/time/temporal/a;->AMPM_OF_DAY:Lj$/time/temporal/a;

    .line 351
    new-instance v15, Lj$/time/temporal/a;

    sget-object v20, Lj$/time/temporal/ChronoUnit;->WEEKS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v10, 0x7

    invoke-static {v5, v6, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const-string v18, "DayOfWeek"

    const-string v16, "DAY_OF_WEEK"

    const/16 v17, 0xf

    invoke-direct/range {v15 .. v22}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object/from16 v30, v15

    sput-object v30, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    .line 369
    new-instance v15, Lj$/time/temporal/a;

    invoke-static {v5, v6, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x10

    const-string v18, "AlignedDayOfWeekInMonth"

    const-string v16, "ALIGNED_DAY_OF_WEEK_IN_MONTH"

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v31, v15

    sput-object v31, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

    .line 387
    new-instance v15, Lj$/time/temporal/a;

    invoke-static {v5, v6, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x11

    const-string v18, "AlignedDayOfWeekInYear"

    const-string v16, "ALIGNED_DAY_OF_WEEK_IN_YEAR"

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v32, v15

    move-object/from16 v40, v20

    sput-object v32, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

    .line 400
    new-instance v15, Lj$/time/temporal/a;

    sget-object v45, Lj$/time/temporal/ChronoUnit;->MONTHS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v10, 0x1c

    const-wide/16 v13, 0x1f

    .line 147
    invoke-static {v10, v11, v13, v14}, Lj$/time/temporal/t;->k(JJ)Lj$/time/temporal/t;

    move-result-object v21

    .line 400
    const-string v18, "DayOfMonth"

    const/16 v22, 0x0

    const-string v16, "DAY_OF_MONTH"

    const/16 v17, 0x12

    move-object/from16 v20, v45

    invoke-direct/range {v15 .. v22}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object v13, v15

    sput-object v13, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    .line 418
    new-instance v15, Lj$/time/temporal/a;

    sget-object v53, Lj$/time/temporal/ChronoUnit;->YEARS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v10, 0x16d

    const-wide/16 v7, 0x16e

    .line 147
    invoke-static {v10, v11, v7, v8}, Lj$/time/temporal/t;->k(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x13

    .line 418
    const-string v18, "DayOfYear"

    const-string v16, "DAY_OF_YEAR"

    move-object/from16 v20, v53

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object v14, v15

    sput-object v14, Lj$/time/temporal/a;->DAY_OF_YEAR:Lj$/time/temporal/a;

    .line 431
    new-instance v15, Lj$/time/temporal/a;

    sget-object v54, Lj$/time/temporal/ChronoUnit;->FOREVER:Lj$/time/temporal/ChronoUnit;

    const-wide v7, -0x550a313cdaL

    const-wide v10, 0x550a1b48f7L

    invoke-static {v7, v8, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v21

    const/16 v17, 0x14

    const-string v18, "EpochDay"

    const-string v16, "EPOCH_DAY"

    move-object/from16 v20, v54

    invoke-direct/range {v15 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v15, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    .line 447
    new-instance v36, Lj$/time/temporal/a;

    const-wide/16 v7, 0x4

    const-wide/16 v10, 0x5

    .line 147
    invoke-static {v7, v8, v10, v11}, Lj$/time/temporal/t;->k(JJ)Lj$/time/temporal/t;

    move-result-object v42

    const/16 v38, 0x15

    .line 447
    const-string v39, "AlignedWeekOfMonth"

    const-string v37, "ALIGNED_WEEK_OF_MONTH"

    move-object/from16 v41, v45

    invoke-direct/range {v36 .. v42}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v16, v36

    move-object/from16 v20, v40

    sput-object v16, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

    .line 463
    new-instance v36, Lj$/time/temporal/a;

    const-wide/16 v7, 0x35

    invoke-static {v5, v6, v7, v8}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v42

    const/16 v38, 0x16

    const-string v39, "AlignedWeekOfYear"

    const-string v37, "ALIGNED_WEEK_OF_YEAR"

    move-object/from16 v41, v53

    invoke-direct/range {v36 .. v42}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v36, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

    .line 474
    new-instance v41, Lj$/time/temporal/a;

    const-wide/16 v7, 0xc

    invoke-static {v5, v6, v7, v8}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v47

    const-string v44, "MonthOfYear"

    const/16 v48, 0x0

    const-string v42, "MONTH_OF_YEAR"

    const/16 v43, 0x17

    move-object/from16 v46, v53

    invoke-direct/range {v41 .. v48}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object/from16 v17, v41

    sput-object v17, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    .line 494
    new-instance v41, Lj$/time/temporal/a;

    const-wide v7, -0x2cb4177f4L

    const-wide v10, 0x2cb4177ffL

    invoke-static {v7, v8, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v47

    const/16 v43, 0x18

    const-string v44, "ProlepticMonth"

    const-string v42, "PROLEPTIC_MONTH"

    move-object/from16 v46, v54

    invoke-direct/range {v41 .. v47}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v41, Lj$/time/temporal/a;->PROLEPTIC_MONTH:Lj$/time/temporal/a;

    .line 529
    new-instance v49, Lj$/time/temporal/a;

    const-wide/32 v7, 0x3b9aca00

    const-wide/32 v10, 0x3b9ac9ff

    .line 147
    invoke-static {v10, v11, v7, v8}, Lj$/time/temporal/t;->k(JJ)Lj$/time/temporal/t;

    move-result-object v55

    const/16 v51, 0x19

    .line 529
    const-string v52, "YearOfEra"

    const-string v50, "YEAR_OF_ERA"

    invoke-direct/range {v49 .. v55}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v18, v49

    sput-object v18, Lj$/time/temporal/a;->YEAR_OF_ERA:Lj$/time/temporal/a;

    .line 553
    new-instance v49, Lj$/time/temporal/a;

    const-wide/32 v7, -0x3b9ac9ff

    invoke-static {v7, v8, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v55

    const-string v52, "Year"

    const/16 v56, 0x0

    const-string v50, "YEAR"

    const/16 v51, 0x1a

    invoke-direct/range {v49 .. v56}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    sput-object v49, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    move-object/from16 v10, v54

    .line 570
    new-instance v54, Lj$/time/temporal/a;

    sget-object v58, Lj$/time/temporal/ChronoUnit;->ERAS:Lj$/time/temporal/ChronoUnit;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v5, v6}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v60

    const-string v57, "Era"

    const/16 v61, 0x0

    const-string v55, "ERA"

    const/16 v56, 0x1b

    move-object/from16 v59, v10

    invoke-direct/range {v54 .. v61}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V

    move-object/from16 v19, v54

    move-object/from16 v54, v59

    sput-object v19, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    .line 585
    new-instance v5, Lj$/time/temporal/a;

    const-wide/high16 v6, -0x8000000000000000L

    const-wide v10, 0x7fffffffffffffffL

    invoke-static {v6, v7, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const/16 v7, 0x1c

    const-string v8, "InstantSeconds"

    const-string v6, "INSTANT_SECONDS"

    move-object/from16 v10, v54

    invoke-direct/range {v5 .. v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    move-object/from16 v20, v5

    sput-object v20, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    .line 599
    new-instance v5, Lj$/time/temporal/a;

    const-wide/32 v6, -0xfd20

    const-wide/32 v10, 0xfd20

    invoke-static {v6, v7, v10, v11}, Lj$/time/temporal/t;->j(JJ)Lj$/time/temporal/t;

    move-result-object v11

    const/16 v7, 0x1d

    const-string v8, "OffsetSeconds"

    const-string v6, "OFFSET_SECONDS"

    move-object/from16 v10, v54

    invoke-direct/range {v5 .. v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V

    sput-object v5, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    const/16 v6, 0x1e

    .line 98
    new-array v6, v6, [Lj$/time/temporal/a;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v4, v6, v0

    const/4 v0, 0x3

    aput-object v23, v6, v0

    const/4 v0, 0x4

    aput-object v24, v6, v0

    const/4 v0, 0x5

    aput-object v25, v6, v0

    const/4 v0, 0x6

    aput-object v12, v6, v0

    const/4 v0, 0x7

    aput-object v34, v6, v0

    const/16 v0, 0x8

    aput-object v26, v6, v0

    const/16 v0, 0x9

    aput-object v2, v6, v0

    const/16 v0, 0xa

    aput-object v3, v6, v0

    const/16 v0, 0xb

    aput-object v35, v6, v0

    const/16 v0, 0xc

    aput-object v27, v6, v0

    const/16 v0, 0xd

    aput-object v28, v6, v0

    const/16 v0, 0xe

    aput-object v29, v6, v0

    const/16 v0, 0xf

    aput-object v30, v6, v0

    const/16 v0, 0x10

    aput-object v31, v6, v0

    const/16 v0, 0x11

    aput-object v32, v6, v0

    const/16 v0, 0x12

    aput-object v13, v6, v0

    const/16 v0, 0x13

    aput-object v14, v6, v0

    const/16 v0, 0x14

    aput-object v15, v6, v0

    const/16 v0, 0x15

    aput-object v16, v6, v0

    const/16 v0, 0x16

    aput-object v36, v6, v0

    const/16 v0, 0x17

    aput-object v17, v6, v0

    const/16 v0, 0x18

    aput-object v41, v6, v0

    const/16 v0, 0x19

    aput-object v18, v6, v0

    const/16 v0, 0x1a

    aput-object v49, v6, v0

    const/16 v0, 0x1b

    aput-object v19, v6, v0

    const/16 v0, 0x1c

    aput-object v20, v6, v0

    const/16 v0, 0x1d

    aput-object v5, v6, v0

    sput-object v6, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;)V
    .locals 0

    .line 607
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 608
    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    .line 611
    iput-object p6, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/ChronoUnit;Lj$/time/temporal/t;I)V
    .locals 0

    .line 616
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 617
    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    .line 620
    iput-object p6, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/t;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj$/time/temporal/a;
    .locals 1

    .line 98
    const-class v0, Lj$/time/temporal/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj$/time/temporal/a;

    return-object p0
.end method

.method public static values()[Lj$/time/temporal/a;
    .locals 1

    .line 98
    sget-object v0, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    invoke-virtual {v0}, [Lj$/time/temporal/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj$/time/temporal/a;

    return-object v0
.end method


# virtual methods
.method public final B(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/t;
    .locals 0

    .line 743
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->t(Lj$/time/temporal/q;)Lj$/time/temporal/t;

    move-result-object p1

    return-object p1
.end method

.method public final D()Z
    .locals 2

    .line 682
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final R(J)I
    .locals 1

    .line 732
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/t;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/t;->a(JLj$/time/temporal/q;)I

    move-result p1

    return p1
.end method

.method public final S(J)V
    .locals 1

    .line 713
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/t;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/t;->b(JLj$/time/temporal/q;)V

    return-void
.end method

.method public final T()Z
    .locals 2

    .line 694
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o()Lj$/time/temporal/t;
    .locals 1

    .line 669
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/t;

    return-object v0
.end method

.method public final synthetic q(Ljava/util/HashMap;Lj$/time/temporal/TemporalAccessor;Lj$/time/format/y;)Lj$/time/temporal/TemporalAccessor;
    .locals 0

    .line 0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final s(Lj$/time/temporal/TemporalAccessor;)J
    .locals 2

    .line 748
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->w(Lj$/time/temporal/q;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final t(Lj$/time/temporal/TemporalAccessor;)Z
    .locals 0

    .line 738
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/q;)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 760
    iget-object v0, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final w(Lj$/time/temporal/Temporal;J)Lj$/time/temporal/Temporal;
    .locals 0

    .line 754
    invoke-interface {p1, p2, p3, p0}, Lj$/time/temporal/Temporal;->d(JLj$/time/temporal/q;)Lj$/time/temporal/Temporal;

    move-result-object p1

    return-object p1
.end method
