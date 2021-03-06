package com.java.basic.polyporhism.ex;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file AK47
 * @description
 * @date 2022/04/04
 */
public class AK47 implements Gun {

    private Integer ammo;
    private static final Integer MAX_AMMO = 30;

    public AK47(Integer ammo) {
        this.ammo = ammo;
    }

    @Override
    public void shoot() {
        this.ammo--;
        System.out.println("AK47 사격 : " + MAX_AMMO + "/" + this.ammo);
    }

    @Override
    public void reload() {
        this.ammo = 30;
        System.out.println("AK47 재장전 완료 : " + MAX_AMMO + "/" + this.ammo);
    }

    @Override
    public Integer getAmmo() {
        return null;
    }
}
