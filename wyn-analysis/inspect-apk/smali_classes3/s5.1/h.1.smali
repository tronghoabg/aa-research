.class public final Ls5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Ls5/h;

.field public static final b:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls5/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls5/h;->a:Ls5/h;

    .line 7
    .line 8
    const-string v0, "prequest"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ls5/h;->b:Lh9/d;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ls5/E;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, Ls5/s;

    .line 6
    .line 7
    iget-object p1, p1, Ls5/s;->a:Ls5/r;

    .line 8
    .line 9
    sget-object v0, Ls5/h;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 12
    .line 13
    .line 14
    return-void
.end method
