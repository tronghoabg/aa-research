.class public final synthetic Lm9/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/p;


# instance fields
.field public final synthetic a:LC8/g;


# direct methods
.method public synthetic constructor <init>(LC8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/D;->a:LC8/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm9/G;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p2, p1

    .line 9
    :goto_0
    const-string v0, "snapshots-in-sync listeners should never get errors."

    .line 10
    .line 11
    new-array p1, p1, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p2, v0, p1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lm9/D;->a:LC8/g;

    .line 17
    .line 18
    invoke-virtual {p1}, LC8/g;->run()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
