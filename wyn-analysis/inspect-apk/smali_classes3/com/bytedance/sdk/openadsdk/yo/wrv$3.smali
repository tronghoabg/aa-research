.class Lcom/bytedance/sdk/openadsdk/yo/wrv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/yo/wrv;->uef(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/yo/wrv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p3, "/200"

    .line 19
    .line 20
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 28
    .line 29
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->yo(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    if-lez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->moa(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->moa(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void

    .line 59
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->moa(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 66
    .line 67
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->lw(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/yo/zjm;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-eqz p3, :cond_2

    .line 72
    .line 73
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$3;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 74
    .line 75
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->lw(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/yo/zjm;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/yo/zjm;->xs()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-nez p3, :cond_2

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    const/4 p2, 0x0

    .line 91
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
