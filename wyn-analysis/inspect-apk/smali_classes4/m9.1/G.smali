.class public final Lm9/G;
.super Ls8/j;
.source "SourceFile"


# instance fields
.field public final a:Lm9/F;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm9/F;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 2
    const-string v0, "Provided message must not be null."

    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object p1, Lm9/F;->b:Lm9/F;

    const/4 v0, 0x0

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    const-string v1, "A FirebaseFirestoreException should never be thrown for OK"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 4
    iput-object p2, p0, Lm9/G;->a:Lm9/F;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lm9/F;Ljava/lang/Exception;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p3}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    const-string p3, "Provided message must not be null."

    invoke-static {p1, p3}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object p1, Lm9/F;->b:Lm9/F;

    const/4 p3, 0x0

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    const-string v0, "A FirebaseFirestoreException should never be thrown for OK"

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1, v0, p3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 8
    const-string p1, "Provided code must not be null."

    invoke-static {p2, p1}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lm9/G;->a:Lm9/F;

    return-void
.end method
