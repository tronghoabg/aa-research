.class public final La0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/b;


# instance fields
.field public final a:Lu0/n;

.field public final b:La0/f;

.field public final c:Landroid/view/autofill/AutofillManager;


# direct methods
.method public constructor <init>(Lu0/n;La0/f;)V
    .locals 1

    .line 1
    const-string v0, "autofillTree"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La0/a;->a:Lu0/n;

    .line 10
    .line 11
    iput-object p2, p0, La0/a;->b:La0/f;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {}, LU1/b;->m()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2}, LU1/b;->i(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    iput-object p2, p0, La0/a;->c:Landroid/view/autofill/AutofillManager;

    .line 32
    .line 33
    invoke-static {p1}, LU1/b;->x(Lu0/n;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Autofill service could not be located."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method
