.class public final Lea/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Lea/f;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lea/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/f;->a:Lea/f;

    .line 7
    .line 8
    const-string v0, "processName"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lea/f;->b:Lh9/d;

    .line 15
    .line 16
    const-string v0, "pid"

    .line 17
    .line 18
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lea/f;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "importance"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lea/f;->d:Lh9/d;

    .line 31
    .line 32
    const-string v0, "defaultProcess"

    .line 33
    .line 34
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lea/f;->e:Lh9/d;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lea/t;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    iget-object v0, p1, Lea/t;->a:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v1, Lea/f;->b:Lh9/d;

    .line 8
    .line 9
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lea/f;->c:Lh9/d;

    .line 13
    .line 14
    iget v1, p1, Lea/t;->b:I

    .line 15
    .line 16
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lea/f;->d:Lh9/d;

    .line 20
    .line 21
    iget v1, p1, Lea/t;->c:I

    .line 22
    .line 23
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lea/f;->e:Lh9/d;

    .line 27
    .line 28
    iget-boolean p1, p1, Lea/t;->d:Z

    .line 29
    .line 30
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Z)Lh9/f;

    .line 31
    .line 32
    .line 33
    return-void
.end method
