.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:LH/d;

.field public static final f:LH/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/4 v1, 0x4

    .line 5
    int-to-float v1, v1

    .line 6
    sput v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->a:F

    .line 7
    .line 8
    sget-wide v1, LL0/j;->c:J

    .line 9
    .line 10
    sput-wide v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->b:J

    .line 11
    .line 12
    invoke-static {v0, v0}, LA6/c;->b(FF)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->c:J

    .line 17
    .line 18
    sget-wide v0, Le0/q;->c:J

    .line 19
    .line 20
    const v2, 0x3e4ccccd    # 0.2f

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, v2}, Le0/q;->a(JF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    sput-wide v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->d:J

    .line 28
    .line 29
    sget-object v0, LH/e;->a:LH/d;

    .line 30
    .line 31
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->e:LH/d;

    .line 32
    .line 33
    const/16 v0, 0x8

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    invoke-static {v0}, LH/e;->a(F)LH/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->f:LH/d;

    .line 41
    .line 42
    return-void
.end method
