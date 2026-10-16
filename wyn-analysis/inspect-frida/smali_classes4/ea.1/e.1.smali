.class public final Lea/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Lea/e;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lea/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/e;->a:Lea/e;

    .line 7
    .line 8
    const-string v0, "performance"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lea/e;->b:Lh9/d;

    .line 15
    .line 16
    const-string v0, "crashlytics"

    .line 17
    .line 18
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lea/e;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "sessionSamplingRate"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lea/e;->d:Lh9/d;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lea/j;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    iget-object v0, p1, Lea/j;->a:Lea/i;

    .line 6
    .line 7
    sget-object v1, Lea/e;->b:Lh9/d;

    .line 8
    .line 9
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lea/j;->b:Lea/i;

    .line 13
    .line 14
    sget-object v1, Lea/e;->c:Lh9/d;

    .line 15
    .line 16
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lea/e;->d:Lh9/d;

    .line 20
    .line 21
    iget-wide v1, p1, Lea/j;->c:D

    .line 22
    .line 23
    invoke-interface {p2, v0, v1, v2}, Lh9/f;->add(Lh9/d;D)Lh9/f;

    .line 24
    .line 25
    .line 26
    return-void
.end method
