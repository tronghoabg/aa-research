.class public final LU8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:LU8/r;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU8/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU8/r;->a:LU8/r;

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
    sput-object v0, LU8/r;->b:Lh9/d;

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
    sput-object v0, LU8/r;->c:Lh9/d;

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
    sput-object v0, LU8/r;->d:Lh9/d;

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
    sput-object v0, LU8/r;->e:Lh9/d;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, LU8/E0;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, LU8/b0;

    .line 6
    .line 7
    iget-object v0, p1, LU8/b0;->a:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, LU8/r;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 12
    .line 13
    .line 14
    iget v0, p1, LU8/b0;->b:I

    .line 15
    .line 16
    sget-object v1, LU8/r;->c:Lh9/d;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 19
    .line 20
    .line 21
    sget-object v0, LU8/r;->d:Lh9/d;

    .line 22
    .line 23
    iget v1, p1, LU8/b0;->c:I

    .line 24
    .line 25
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 26
    .line 27
    .line 28
    sget-object v0, LU8/r;->e:Lh9/d;

    .line 29
    .line 30
    iget-boolean p1, p1, LU8/b0;->d:Z

    .line 31
    .line 32
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Z)Lh9/f;

    .line 33
    .line 34
    .line 35
    return-void
.end method
