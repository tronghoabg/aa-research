.class public final Lb0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/a;


# static fields
.field public static final a:Lb0/g;

.field public static final b:J

.field public static final c:LL0/i;

.field public static final d:LL0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb0/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb0/g;->a:Lb0/g;

    .line 7
    .line 8
    sget-wide v0, Ld0/f;->c:J

    .line 9
    .line 10
    sput-wide v0, Lb0/g;->b:J

    .line 11
    .line 12
    sget-object v0, LL0/i;->a:LL0/i;

    .line 13
    .line 14
    sput-object v0, Lb0/g;->c:LL0/i;

    .line 15
    .line 16
    new-instance v0, LL0/c;

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-direct {v0, v1, v1}, LL0/c;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lb0/g;->d:LL0/c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b()LL0/b;
    .locals 1

    .line 1
    sget-object v0, Lb0/g;->d:LL0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    sget-wide v0, Lb0/g;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLayoutDirection()LL0/i;
    .locals 1

    .line 1
    sget-object v0, Lb0/g;->c:LL0/i;

    .line 2
    .line 3
    return-object v0
.end method
