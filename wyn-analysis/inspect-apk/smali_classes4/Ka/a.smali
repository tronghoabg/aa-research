.class public LKa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;


# instance fields
.field public a:Luc/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    new-instance v0, Luc/r;

    .line 2
    .line 3
    iget-object v1, p1, Lqc/a;->c:Luc/f;

    .line 4
    .line 5
    const-string v2, "google_mlkit_text_recognizer"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LKa/a;->a:Luc/r;

    .line 11
    .line 12
    new-instance v1, LKa/c;

    .line 13
    .line 14
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-direct {v1, p1}, LKa/c;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Luc/r;->b(Luc/p;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LKa/a;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
